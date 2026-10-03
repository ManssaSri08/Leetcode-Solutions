/*
LeetCode: 2481. Minimum Cuts to Divide a Circle
Runtime: N/A
Memory: 40556000
*/

class Solution {
    public int numberOfCuts(int n) {
        if(n==1) return 0;
        if(n%2==0) return n/2;
        else return n;
    }
}
