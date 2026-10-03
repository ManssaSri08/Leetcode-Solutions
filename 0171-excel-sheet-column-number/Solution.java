/*
LeetCode: 171. Excel Sheet Column Number
Runtime: 1
Memory: 43756000
*/

class Solution {
    public int titleToNumber(String columnTitle) {
        int val=0;
        for(char ch:columnTitle.toCharArray()){
            val=val*26+(ch-'A'+1);
        }
        return val;
    }
}
