/*
LeetCode: 214. Shortest Palindrome
Runtime: 8
Memory: 46940000
*/

class Solution {
    public String shortestPalindrome(String s) {
        String reverse=new StringBuilder(s).reverse().toString();
        String str=s+"#"+reverse;
        int i=1, len=0;
        int[] lps=new int[str.length()];
        while(i<str.length()){
            if(str.charAt(i)==str.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else{
                if(len!=0)
                    len=lps[len-1];
                else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        int longest=lps[str.length()-1];
        String prefix=reverse.substring(0,s.length()-longest);
        return prefix+s;
    }
}
