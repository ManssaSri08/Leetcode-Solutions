class Solution {
    public int rob(int[] arr) {
        int n=arr.length;
        if(n==1) return arr[0];
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return fun(n-1,arr,dp);
    }
    public static int fun(int i,int[] arr,int[] dp){
        if(i==0) return arr[i];
        if(i==1) return Math.max(arr[0],arr[1]);
        if(dp[i]!=-1) return dp[i];
        return dp[i]=Math.max(fun(i-1,arr,dp),fun(i-2,arr,dp)+arr[i]);
    }
}
