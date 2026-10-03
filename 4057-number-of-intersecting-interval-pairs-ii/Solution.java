/*
LeetCode: 4057. Number of Intersecting Interval Pairs II
Runtime: 76
Memory: 225364000
*/

class Solution {
    public long countIntersectingIntervals(int[][] intervals) {
        int[][] temoravlin=intervals;
        Arrays.sort(temoravlin,(a,b)->Integer.compare(a[0],b[0]));
        int n=temoravlin.length;
        int[] ends=new int[n];
        for(int i=0;i<n;i++){
            ends[i]=temoravlin[i][1];
        }
        Arrays.sort(ends);
        long count=0;
        for(int i=0;i<n;i++){
            int start=temoravlin[i][0];
            int left=0,right=i;
            while(left<right){
                int mid=left+(right-left)/2;
                if(ends[mid]>=start)
                    right=mid;
                else
                    left=mid+1;
            }
            count+=i-left;
        }
        return count;
    }
}
