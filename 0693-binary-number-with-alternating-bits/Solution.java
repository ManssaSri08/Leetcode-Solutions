/*
LeetCode: 693. Binary Number with Alternating Bits
Runtime: N/A
Memory: 42224000
*/

class Solution {
    public boolean hasAlternatingBits(int n) {
        int x = n ^ (n >> 1);
        return (x & (x + 1)) == 0;
    }
}
