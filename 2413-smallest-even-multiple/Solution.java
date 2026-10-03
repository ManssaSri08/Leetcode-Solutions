/*
LeetCode: 2413. Smallest Even Multiple
Runtime: N/A
Memory: 41104000
*/

class Solution {
    public int smallestEvenMultiple(int n) {
        if(n%2==0)
        return n;
        else
        return n*2;
    }
}
