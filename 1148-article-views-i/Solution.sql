/*
LeetCode: 1148. Article Views I
Runtime: 439
Memory: N/A
*/

SELECT DISTINCT author_id AS id 
FROM Views 
WHERE viewer_id=author_id 
ORDER BY id asc;
