/*
LeetCode: 1991. Find the Middle Index in Array
Runtime: N/A
Memory: 43532000
*/

class Solution {
    public int findMiddleIndex(int[] nums) {
        int leftSum=0;
        for(int i=0;i<nums.length;i++){
            int rightSum=0;
            for(int j=i+1;j<nums.length;j++){
                rightSum+=nums[j];
            }
            if(leftSum==rightSum) return i;
            leftSum+=nums[i];
        }
        return -1;
    }
}
