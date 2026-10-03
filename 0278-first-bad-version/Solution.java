/*
LeetCode: 278. First Bad Version
Runtime: 13
Memory: 42108000
*/

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start=1,end=n;
        while(start<end){
            int mid=start+(end-start)/2;
            if(isBadVersion(mid)){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}
