/*
LeetCode: 53. Maximum Subarray
Runtime: 1
Memory: 76864000
*/

class Solution {
    public int maxSubArray(int[] nums) {
        int currSum=0,maxSum=nums[0];
        for(int i=0;i<nums.length;i++){
            currSum+=nums[i];
            if(currSum>maxSum) maxSum=currSum;
            if(currSum<0) currSum=0;
        }
        return maxSum;
    }
}
