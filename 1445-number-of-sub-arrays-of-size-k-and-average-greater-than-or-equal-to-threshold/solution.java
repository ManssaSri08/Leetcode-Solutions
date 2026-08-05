class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n=arr.length,cnt=0,sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int avg=sum/k;
        if(avg>=threshold) cnt++;
        for(int i=k;i<n;i++){
            sum=sum-arr[i-k]+arr[i];
            avg=sum/k;
            if(avg>=threshold) cnt++;
        }
        return cnt;
    }
}
