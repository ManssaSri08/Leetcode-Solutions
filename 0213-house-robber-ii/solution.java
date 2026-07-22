class Solution {
    public int rob(int[] arr) {
        int n=arr.length;
        if(n==1) return arr[0];
        if(n==2) return Math.max(arr[0],arr[1]);
        int[] dp1=new int[n], dp2=new int[n];
        Arrays.fill(dp1,-1); Arrays.fill(dp2,-1);
        int case1=fun(n-2,0,arr,dp1), case2=fun(n-1,1,arr,dp2);
        return Math.max(case1,case2);
    }
    public int fun(int i,int start,int[] arr,int[] dp){
        if(i==start) return arr[start];
        if(i<start) return 0;
        if(dp[i]!=-1) return dp[i];
        int take=fun(i-2,start,arr,dp)+arr[i], notTake=fun(i-1,start,arr,dp);
        return dp[i]=Math.max(take,notTake);
    }
}
