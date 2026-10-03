/*
LeetCode: 977. Squares of a Sorted Array
Runtime: 10
Memory: 47608000
*/

class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
