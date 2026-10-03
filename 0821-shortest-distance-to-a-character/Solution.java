/*
LeetCode: 821. Shortest Distance to a Character
Runtime: 1
Memory: 44068000
*/

class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];
        int prev = -10000; 
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            ans[i] = i - prev;
        }
        prev = 10000;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            ans[i] = Math.min(ans[i], prev - i);
        }
        return ans;
    }
}

