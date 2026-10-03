/*
LeetCode: 1221. Split a String in Balanced Strings
Runtime: N/A
Memory: 42736000
*/

class Solution {
    public int balancedStringSplit(String s) {
        int balance=0,count=0;
        for(char ch:s.toCharArray()){
            if(ch=='R') balance++;
            else if(ch=='L') balance--;
            if(balance==0) count++;
        }
        return count;
    }
}
