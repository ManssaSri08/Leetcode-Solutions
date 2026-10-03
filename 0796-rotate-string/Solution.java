/*
LeetCode: 796. Rotate String
Runtime: N/A
Memory: 42500000
*/

class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        return (s+s).contains(goal);
    }
}
