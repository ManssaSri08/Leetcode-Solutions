class Solution {
    public int findMin(int[] nums) {
        int start=0,end=nums.length-1,mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(mid>0 && nums[mid]<nums[mid-1]){
                return nums[mid];
            }
            if(nums[mid]>nums[end]){
                start=mid+1;
            }
            else if(nums[mid]<nums[end]){
                end=mid;
            }
            else{
                end--;
            }
        }
        return nums[start];
    }
}
