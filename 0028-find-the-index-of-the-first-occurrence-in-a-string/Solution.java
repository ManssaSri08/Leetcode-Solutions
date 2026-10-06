/*
LeetCode: 28. Find the Index of the First Occurrence in a String
Runtime: 3
Memory: 42860000
*/

class Solution {
    public int strStr(String text, String pattern) {
        int[] lps=new int[pattern.length()];
        int i=1, len=0;
        while(i<pattern.length()){
            if(pattern.charAt(i)==pattern.charAt(len)){
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
        int j=0; i=0;
        while(i<text.length()){
            if(text.charAt(i)==pattern.charAt(j)){
                i++; j++;
                if(j==pattern.length())
                    return i-j;
            }
            else{
                if(j!=0) j=lps[j-1];
                else i++;
            }
        }
        return -1;
    }
}
