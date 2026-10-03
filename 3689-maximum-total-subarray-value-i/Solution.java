/*
LeetCode: 3689. Maximum Total Subarray Value I
Runtime: 1
Memory: 62232000
*/

class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int max=nums[0],min=nums[0];
        for(int num:nums){
            max=Math.max(max,num);
            min=Math.min(min,num);
        }
        return 1L*(max-min)*k;
    }
}
