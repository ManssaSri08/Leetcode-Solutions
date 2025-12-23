class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=leftHalf(nums,target);
        int right=rightHalf(nums,target);
        return new int[]{left,right};
    }
    static int leftHalf(int[] nums,int target){
        int start=0,end=nums.length-1,index=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                index=mid;
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return index;
    }
    static int rightHalf(int[] nums,int target){
        int start=0,end=nums.length-1,index=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                index=mid;
                start=mid+1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return index;
    }
}
