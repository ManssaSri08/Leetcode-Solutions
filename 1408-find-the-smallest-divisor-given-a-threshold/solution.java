class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length, max=0;
        for(int num:nums) if(num>max) max=num;
        int low=1, high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            int sum=fun(nums,mid);
            if(sum>threshold){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
    public static int fun(int[] arr, int div){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans+=(arr[i]+div-1)/div;
        }
        return ans;
    }
}
