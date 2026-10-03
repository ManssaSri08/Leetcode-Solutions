/*
LeetCode: 283. Move Zeroes
Runtime: 1
Memory: 47924000
*/

class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        for(int n:nums)
            if(n!=0)
                nums[i++]=n;
        while(i<nums.length)
            nums[i++]=0;
    }
}
