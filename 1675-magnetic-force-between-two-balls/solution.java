class Solution {
    public int maxDistance(int[] position, int m) {
        int n=position.length;
        Arrays.sort(position);
        int low=1, high=position[n-1]-position[0];
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canWePlace(position,mid,m)){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return high;
    }
    public static boolean canWePlace(int[] arr, int dist, int balls){
        int cntBalls=1, last=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-last>=dist){
                cntBalls++;
                last=arr[i];
            }
            if(cntBalls>=balls) return true;
        }
        return false;
    }
}
