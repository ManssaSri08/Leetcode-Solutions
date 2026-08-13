class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int n:piles)
            if(n>max)
                max=n;
        int low=1,high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            long val=fun(piles,mid);
            if(val<=h)
                high=mid-1;
            else
                low=mid+1;
        }
        return low;
    }
    public static long fun(int[] arr,int h){
        long totHr=0;
        for(int i=0;i<arr.length;i++){
            totHr+=(arr[i]+h-1)/h;
        }
        return totHr;
    }
}
