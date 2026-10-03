/*
LeetCode: 125. Valid Palindrome
Runtime: 15
Memory: 46528000
*/

class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int start=0,end=s.length()-1;
        char[] ch=s.toCharArray();
        while(start<end){
            if(ch[start]!=ch[end]) return false;
            start++; end--;
        }
        return true;
    }
}


