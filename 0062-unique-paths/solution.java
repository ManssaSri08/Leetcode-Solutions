class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        return fun(m-1,n-1,dp);
    }
    public int fun(int i,int j,int[][] dp){
        int m=dp.length, n=dp[0].length;
        if(i==0 || j==0) return 1;
        if(dp[i][j]!=0) return dp[i][j];
        return dp[i][j]=fun(i,j-1,dp)+fun(i-1,j,dp);
    }
}
