/*
LeetCode: 3370. Smallest Number With All Set Bits
Runtime: N/A
Memory: 40688000
*/

class Solution {
    public int smallestNumber(int n) {
        if(n==0) return 1;
        for(long i=n;;i++){
            if((i&(i+1))==0){
                return (int)i;
            }
        }
    }
}
