class Solution {
    public static int fun(int[] dp,int n){
        if(n<=3) return n;
        if(dp[n-1]!=0) return dp[n-1];
        return dp[n-1]=fun(dp,n-1)+fun(dp,n-2);
    }
    public int climbStairs(int n) {
        int[] dp=new int[n];
        return fun(dp,n);
    }
}
