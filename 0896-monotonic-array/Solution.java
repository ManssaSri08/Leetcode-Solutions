/*
LeetCode: 896. Monotonic Array
Runtime: 2
Memory: 85392000
*/

class Solution {
    public boolean isMonotonic(int[] nums) {
        int n=nums.length,inc=0,dec=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]<=nums[i+1]) inc++;
            if(nums[i]>=nums[i+1]) dec++;
        }
        return (inc==n-1 || dec==n-1);
    }
}
