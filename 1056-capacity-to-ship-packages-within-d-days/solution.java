class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=0, sum=0;
        for(int w:weights){
            if(w>max) max=w;
            sum+=w;
        }
        int low=max, high=sum;
        while(low<=high){
            int mid=low+(high-low)/2;
            int req=fun(weights,mid);
            if(req>days)
                low=mid+1;
            else
                high=mid-1;
        }
        return low;
    }
    public static int fun(int[] arr,int capacity){
        int days=1, load=0;
        for(int i=0;i<arr.length;i++){
            if(load+arr[i]>capacity){
                days++;
                load=arr[i];
            }
            else{
                load+=arr[i];
            }
        }
        return days;
    }
}
