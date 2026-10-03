/*
LeetCode: 779. K-th Symbol in Grammar
Runtime: N/A
Memory: 40656000
*/

class Solution {
    public int kthGrammar(int n, int k) {
        return Integer.bitCount(k - 1) % 2;
    }
}
