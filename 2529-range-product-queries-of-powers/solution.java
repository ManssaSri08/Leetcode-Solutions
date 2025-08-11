class Solution {
    public int[] productQueries(int n, int[][] queries) {
        int MOD = 1_000_000_007;

        int[] temp = new int[32];
        int len = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) { 
                temp[len++] = 1 << i;
            }
        }

        int[] powers = new int[len];
        System.arraycopy(temp, 0, powers, 0, len);
        int[] ans = new int[queries.length];
        for (int q = 0; q < queries.length; q++) {
            long prod = 1;
            int left = queries[q][0], right = queries[q][1];
            for (int i = left; i <= right; i++) {
                prod = (prod * powers[i]) % MOD;
            }
            ans[q] = (int) prod;
        }
        return ans;
    }
}

