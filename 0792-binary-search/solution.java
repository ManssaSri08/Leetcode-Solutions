class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length,low=0,high=n-1,found=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                found=mid; break;  
            }
            else if(nums[mid]<target){
                low=mid+1;  
            }
            else{
                high=mid-1;  
            }
        }
        return found;
    }
}
