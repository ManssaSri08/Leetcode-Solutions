/*
LeetCode: 459. Repeated Substring Pattern
Runtime: 6
Memory: 46672000
*/

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        int[] lps=new int[n];
        int i=1, len=0;
        while(i<n){
            if(s.charAt(i)==s.charAt(len)){
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
        int len1=n-lps[n-1];
        return lps[n-1]!=0 && n%len1==0;
    }
}
