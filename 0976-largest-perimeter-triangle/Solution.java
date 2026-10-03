/*
LeetCode: 976. Largest Perimeter Triangle
Runtime: 7
Memory: 45108000
*/

class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int i=nums.length-3;i>=0;i--)
            if(nums[i]+nums[i+1] > nums[i+2])
                return nums[i]+nums[i+1]+nums[i+2];
        return 0;
    }
}
