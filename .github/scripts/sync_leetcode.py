import os
import re
import time
from pathlib import Path

import requests


URL = "https://leetcode.com/graphql/"

SESSION = os.environ["LEETCODE_SESSION"]
CSRF = os.environ["LEETCODE_CSRF_TOKEN"]
USERNAME = os.environ["LEETCODE_USERNAME"]


headers = {
    "Content-Type": "application/json",
    "User-Agent": "Mozilla/5.0",
    "Referer": "https://leetcode.com/progress/",
    "Origin": "https://leetcode.com",
    "x-csrftoken": CSRF
}

cookies = {
    "LEETCODE_SESSION": SESSION,
    "csrftoken": CSRF
}


def graphql(query, variables):
    response = requests.post(
        URL,
        headers=headers,
        cookies=cookies,
        json={
            "query": query,
            "variables": variables
        },
        timeout=60
    )

    response.raise_for_status()

    data = response.json()

    if "errors" in data:
        raise Exception(data["errors"])

    if not data.get("data"):
        raise Exception("No data returned by LeetCode")

    return data["data"]


def get_all_solved_questions():
    print("Getting all solved problems...")

    query = """
    query userProgressQuestionList($filters: UserProgressQuestionListInput) {
        userProgressQuestionList(filters: $filters) {
            totalNum
            questions {
                frontendId
                title
                titleSlug
                difficulty
                lastSubmittedAt
            }
        }
    }
    """

    all_questions = []
    skip = 0
    limit = 100

    while True:
        print(f"Getting solved problems {skip + 1} - {skip + limit}...")

        data = graphql(
            query,
            {
                "filters": {
                    "questionStatus": "SOLVED",
                    "skip": skip,
                    "limit": limit
                }
            }
        )

        result = data.get("userProgressQuestionList")

        if not result:
            raise Exception(
                "Could not get solved problems. "
                "Your LeetCode session may have expired."
            )

        questions = result.get("questions") or []
        total = result.get("totalNum", 0)

        all_questions.extend(questions)

        print(f"Received {len(questions)} problems. Total: {total}")

        if not questions:
            break

        skip += len(questions)

        if skip >= total:
            break

        time.sleep(1)

    print(f"Total solved problems found: {len(all_questions)}")

    return all_questions


def get_latest_accepted_submission(slug):
    query = """
    query questionSubmissionList(
        $offset: Int!,
        $limit: Int!,
        $questionSlug: String!
    ) {
        questionSubmissionList(
            offset: $offset,
            limit: $limit,
            questionSlug: $questionSlug
        ) {
            submissions {
                id
                statusDisplay
                lang
                timestamp
            }
        }
    }
    """

    data = graphql(
        query,
        {
            "offset": 0,
            "limit": 20,
            "questionSlug": slug
        }
    )

    result = data.get("questionSubmissionList")

    if not result:
        return None

    submissions = result.get("submissions") or []

    for submission in submissions:
        if submission.get("statusDisplay") == "Accepted":
            return submission

    return None


def get_submission_details(submission_id):
    query = """
    query submissionDetails($submissionId: Int!) {
        submissionDetails(submissionId: $submissionId) {
            code
            lang {
                name
            }
            runtime
            memory
            statusDisplay
        }
    }
    """

    data = graphql(
        query,
        {
            "submissionId": int(submission_id)
        }
    )

    return data.get("submissionDetails")


def get_extension(language):
    language = language.lower()

    extension_map = {
        "java": "java",
        "python": "py",
        "python3": "py",
        "cpp": "cpp",
        "c++": "cpp",
        "c": "c",
        "javascript": "js",
        "typescript": "ts",
        "kotlin": "kt",
        "go": "go",
        "golang": "go",
        "rust": "rs",
        "csharp": "cs",
        "c#": "cs",
        "swift": "swift",
        "php": "php",
        "ruby": "rb",
        "scala": "scala",
        "dart": "dart",
        "mysql": "sql",
        "mssql": "sql",
        "oraclesql": "sql",
        "postgresql": "sql",
        "bash": "sh"
    }

    return extension_map.get(language, "txt")


def create_folder(number, title):
    safe_title = re.sub(
        r"[^a-z0-9]+",
        "-",
        title.lower()
    ).strip("-")

    return Path(
        f"{int(number):04d}-{safe_title}"
    )


def create_content(number, title, runtime, memory, code):
    return f"""/*
LeetCode: {number}. {title}
Runtime: {runtime}
Memory: {memory}
*/

{code}
"""


def sync_problem(problem):
    number = problem["frontendId"]
    title = problem["title"]
    slug = problem["titleSlug"]

    print()
    print("=" * 60)
    print(f"Problem: {number}. {title}")
    print(f"Slug: {slug}")

    submission = get_latest_accepted_submission(slug)

    if not submission:
        print("No accepted submission found.")
        return

    submission_id = submission["id"]

    print(f"Accepted submission ID: {submission_id}")

    details = get_submission_details(submission_id)

    if not details:
        print("Submission details unavailable.")
        return

    code = details.get("code")

    if not code:
        print("Code unavailable.")
        return

    language = details.get("lang")

    if isinstance(language, dict):
        language = language.get("name", "")
    else:
        language = str(language or "")

    extension = get_extension(language)

    runtime = details.get("runtime") or "N/A"
    memory = details.get("memory") or "N/A"

    folder = create_folder(number, title)

    folder.mkdir(
        parents=True,
        exist_ok=True
    )

    file_path = folder / f"Solution.{extension}"

    content = create_content(
        number,
        title,
        runtime,
        memory,
        code
    )

    if file_path.exists():
        old_content = file_path.read_text(
            encoding="utf-8"
        )

        if old_content.strip() == content.strip():
            print(f"No change: {file_path}")
            return

    file_path.write_text(
        content,
        encoding="utf-8"
    )

    print(f"Updated: {file_path}")

    time.sleep(1)


def main():
    print("=" * 60)
    print("LeetCode → GitHub Automatic Sync")
    print("=" * 60)

    questions = get_all_solved_questions()

    if not questions:
        print("No solved problems found.")
        return

    print()
    print(f"Starting sync of {len(questions)} problems...")

    success = 0
    failed = 0

    for index, problem in enumerate(questions, start=1):
        print()
        print(f"[{index}/{len(questions)}]")

        try:
            sync_problem(problem)
            success += 1
        except Exception as e:
            failed += 1
            print(
                f"ERROR: {problem.get('title')}: {e}"
            )

        time.sleep(1)

    print()
    print("=" * 60)
    print("SYNC COMPLETE")
    print("=" * 60)
    print(f"Problems processed: {len(questions)}")
    print(f"Successful: {success}")
    print(f"Failed: {failed}")
    print("=" * 60)


if __name__ == "__main__":
    main()
