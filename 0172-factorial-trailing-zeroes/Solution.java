/*
LeetCode: 172. Factorial Trailing Zeroes
Runtime: N/A
Memory: 42608000
*/

class Solution {
    public int trailingZeroes(int n) {
        int count=0;
        while(n>0){
            n/=5;
            count+=n;
        }
        return count;
    }
}
