/*
LeetCode: 1480. Running Sum of 1d Array
Runtime: N/A
Memory: 42544000
*/

class Solution {
    public int[] runningSum(int[] nums) {
        int[] prefix=new int[nums.length];
        if(nums.length>0){
            prefix[0]=nums[0];
            for(int i=1;i<nums.length;i++){
                prefix[i]=prefix[i-1]+nums[i];
            }
        }
        return prefix;
    }
}
