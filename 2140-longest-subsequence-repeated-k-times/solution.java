class Solution {

    String ans = "";
    List<Character> chars = new ArrayList<>();
    int k;

    public String longestSubsequenceRepeatedK(String s, int k) {
        this.k = k;

        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (int i = 25; i >= 0; i--) {
            if (freq[i] >= k) {
                chars.add((char) ('a' + i));
            }
        }

        dfs(new StringBuilder(), s);

        return ans;
    }

    private void dfs(StringBuilder curr, String s) {

        if (curr.length() > ans.length() ||
           (curr.length() == ans.length() &&
            curr.toString().compareTo(ans) > 0)) {
            ans = curr.toString();
        }

        for (char ch : chars) {
            curr.append(ch);

            if (isValid(curr, s)) {
                dfs(curr, s);
            }

            curr.deleteCharAt(curr.length() - 1);
        }
    }

    private boolean isValid(StringBuilder t, String s) {

        int j = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t.charAt(j)) {
                j++;

                if (j == t.length()) {
                    count++;
                    j = 0;

                    if (count == k) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
