/*
LeetCode: 678. Valid Parenthesis String
Runtime: N/A
Memory: 42640000
*/

class Solution {
    public boolean checkValidString(String s) {
        int start=0,end=s.length()-1,leftCount=0,rightCount=0;
        char[] ch=s.toCharArray();
        while(start<s.length() && end>=0){
            if(ch[start]=='(' || ch[start]=='*') leftCount++;
            else leftCount--;
            if(leftCount<0) return false;
            if(ch[end]==')' || ch[end]=='*') rightCount++;
            else rightCount--;
            if(rightCount<0) return false;
            start++; end--;
        }
        return true;
    }
}
