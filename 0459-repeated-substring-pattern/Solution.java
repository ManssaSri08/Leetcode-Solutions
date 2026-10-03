/*
LeetCode: 459. Repeated Substring Pattern
Runtime: 76
Memory: 46972000
*/

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String str = s + s;
        return str.substring(1, str.length() - 1).contains(s);
    }
}
