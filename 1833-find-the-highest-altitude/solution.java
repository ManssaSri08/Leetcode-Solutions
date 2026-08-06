class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length,max=0;
        for(int i=1;i<n;i++){
            gain[i]+=gain[i-1];
        }
        for(int a:gain){
            if(a>max) max=a;
        }
        return max;
    }
}
