/*
LeetCode: 2348. Number of Zero-Filled Subarrays
Runtime: 3
Memory: 62796000
*/

class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count=0;
        long streak=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                streak++;
                count+=streak;
            }
            else{
                streak=0;
            }
        }
        return count;
    }
}
