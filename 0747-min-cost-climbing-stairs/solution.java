class Solution {
    public int minCostClimbingStairs(int[] arr) {
        int n=arr.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return Math.min(fun(n-1,arr,dp), fun(n-2,arr,dp));
    }
    public static int fun(int i,int[] arr,int[] dp){
        if(i<=1) return arr[i];
        if(dp[i]!=-1) return dp[i];
        return dp[i]=Math.min(fun(i-1,arr,dp), fun(i-2,arr,dp))+arr[i];
    }
}
