class Solution {
    private static final int MOD = 1000000007;
    private int n, x;
    private Integer[][] dp;
    public int numberOfWays(int n, int x) {
        this.n = n;
        this.x = x;
        dp = new Integer[n + 1][n + 1];
        return dfs(1, 0);
    }
    private int dfs(int num, int total) {
        if (total == n) return 1;
        if (total > n || Math.pow(num, x) > n) return 0;
        if (dp[num][total] != null) return dp[num][total];    
        int power = (int) Math.pow(num, x);
        int take = dfs(num + 1, total + power) % MOD;
        int skip = dfs(num + 1, total) % MOD;
        return dp[num][total] = (take + skip) % MOD;
    }
}
