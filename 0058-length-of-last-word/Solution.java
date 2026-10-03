/*
LeetCode: 58. Length of Last Word
Runtime: N/A
Memory: 41548000
*/

class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int last=s.lastIndexOf(' ');
        return s.length()-last-1;
    }
}
