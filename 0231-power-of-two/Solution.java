/*
LeetCode: 231. Power of Two
Runtime: 1
Memory: 40892000
*/

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        while(n%2==0){
            n/=2;
        }
        return n==1;
    }
}
