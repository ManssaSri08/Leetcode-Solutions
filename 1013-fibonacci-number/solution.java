class Solution {
    //memoization
    public int fib(int n) {
        if(n<=1) return n;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return fun(n,dp);
    }
    public int fun(int i,int[] dp){
        if(i<=1) return i;
        if(dp[i]!=-1) return dp[i];
        return dp[i]=fun(i-1,dp)+fun(i-2,dp);
    }
}
