class Solution {
    public int splitArray(int[] nums, int k) {
        int max=0, sum=0;
        for(int num:nums){
            if(num>max) max=num;
            sum+=num;
        }
        int low=max, high=sum;
        while(low<=high){
            int mid=low+(high-low)/2;
            int part=fun(nums,mid);
            if(part>k) low=mid+1;
            else high=mid-1;
        }
        return low;
    }
    public static int fun(int[] arr, int capacity){
        int splits=1, tot=0;
        for(int i=0;i<arr.length;i++){
            if(tot+arr[i]<=capacity){
                tot+=arr[i];
            }
            else{
                splits++;
                tot=arr[i];
            }
        }
        return splits;
    }
}
