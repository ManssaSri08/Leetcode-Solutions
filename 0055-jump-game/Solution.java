/*
LeetCode: 55. Jump Game
Runtime: 2
Memory: 47940000
*/

class Solution {
    public boolean canJump(int[] nums) {
        int maxReach=0;
        for(int i=0;i<nums.length;i++){
            if(i>maxReach) return false;
            maxReach=Math.max(maxReach,i+nums[i]);
        }
        return true;
    }
}
