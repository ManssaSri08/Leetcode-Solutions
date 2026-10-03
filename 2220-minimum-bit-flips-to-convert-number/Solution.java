/*
LeetCode: 2220. Minimum Bit Flips to Convert Number
Runtime: N/A
Memory: 42244000
*/

class Solution {
    public int minBitFlips(int start, int goal) {
        return Integer.bitCount(start^goal);
    }
}
