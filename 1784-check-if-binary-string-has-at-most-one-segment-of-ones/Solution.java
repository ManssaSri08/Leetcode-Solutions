/*
LeetCode: 1784. Check if Binary String Has at Most One Segment of Ones
Runtime: N/A
Memory: 42904000
*/

class Solution {
    public boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }
}
