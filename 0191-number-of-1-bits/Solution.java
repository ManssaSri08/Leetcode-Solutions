/*
LeetCode: 191. Number of 1 Bits
Runtime: N/A
Memory: 42372000
*/

class Solution {
    public int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            if(n%2==1) count++;
            n/=2;
        }
        return count;
    }
}
