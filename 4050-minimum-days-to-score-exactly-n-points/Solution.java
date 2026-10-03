/*
LeetCode: 4050. Minimum Days to Score Exactly N Points
Runtime: 197
Memory: 45824000
*/

class Solution {
    public int minDays(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,n+1);
        dp[0]=-1;
        for(int i=1;i<=n;i++){
            for(int k=1;k*(k+1)/2<=i;k++){
                int points=k*(k+1)/2;
                dp[i]=Math.min(dp[i],dp[i-points]+k+1);
            }
        }
        return dp[n];
    }
}
