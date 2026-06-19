class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length,max=0;
        int[] arr=new int[n+1];
        arr[0]=0;
        for(int i=0;i<n;i++){
            arr[i+1]=arr[i]+gain[i];
        }
        for(int a:arr){
            if(a>max) max=a;
        }
        return max;
    }
}
