/*
LeetCode: 416. Partition Equal Subset Sum
Runtime: 31
Memory: 43448000
*/

class Solution {
    public boolean canPartition(int[] nums) {
        int total=0;
        for(int n:nums){
            total+=n;
        }
        if(total%2==1)  return false;
        int target=total/2;
        boolean[] dp=new boolean[target+1];
        dp[0]=true;
        for(int num:nums){
            for(int j=target;j>=num;j--){
                dp[j]=dp[j] || dp[j-num];
            }
        }
        return dp[target];
    }
}
