class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int n=days.length;
        int[] dp=new int[days[n-1]+1];
        dp[0]=0;
        int Tr=0;
        for(int i=1;i<=days[n-1];i++){
            if(i!=days[Tr]){
                dp[i]=dp[i-1];
            }
            else{
                int v1=dp[i-1]+costs[0];
                int v2=dp[Math.max(i-7,0)]+costs[1];
                int v3=dp[Math.max(i-30,0)]+costs[2];
                dp[i]=Math.min(v1,Math.min(v2,v3));
                Tr++;
            }
        }
        return dp[days[n-1]];
    }
}
