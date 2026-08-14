class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length, max=0;
        if((long)m*k>n) return -1;
        for(int num:bloomDay) if(num>max) max=num;
        int low=1,high=max;  
        while(low<=high){
            int mid=low+(high-low)/2;
            if(!possible(bloomDay,mid,m,k))
                low=mid+1;
            else
                high=mid-1;
        }
        return low;
    }
    public static boolean possible(int[] arr,int day,int m,int k){
        int count=0,bloom=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=day){
                count++;
            }
            else{
                bloom+=(count/k);
                count=0;
            }
        }
        bloom+=(count/k);
        return (bloom>=m)?true:false;
    }
}
