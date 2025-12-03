class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] diff=new int[n+2];
        for(int[] b:bookings){
            int start=b[0];
            int end=b[1];
            int seats=b[2];
            diff[start]+=seats;
            diff[end+1]-=seats;
        }
        int[] result=new int[n];
        int running=0;
        for(int i=1;i<=n;i++){
            running+=diff[i];
            result[i-1]=running;
        }
        return result;
    }
}
