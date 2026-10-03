/*
LeetCode: 34. Find First and Last Position of Element in Sorted Array
Runtime: N/A
Memory: 48456000
*/

class Solution {
    public int lowerBound(int[] arr,int target){
        int n=arr.length;
        int low=0, high=n-1, ans=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=target){
                ans=mid; high=mid-1;
            }
            else
                low=mid+1;
        }
        return ans;
    }
    public int upperBound(int[] arr,int target){
        int n=arr.length;
        int low=0, high=n-1, ans=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>target){
                ans=mid; high=mid-1;
            }
            else
                low=mid+1;
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int first=lowerBound(nums,target);
        if(first==nums.length || nums[first]!=target)
            return new int[]{-1,-1};
        int last=upperBound(nums,target)-1;
        return new int[]{first,last};
    }
}
