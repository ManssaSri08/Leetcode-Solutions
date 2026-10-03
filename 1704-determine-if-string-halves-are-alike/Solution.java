/*
LeetCode: 1704. Determine if String Halves Are Alike
Runtime: 5
Memory: 42908000
*/

class Solution {
    public boolean halvesAreAlike(String s) {
        int len=s.length();
        int half=len/2;
        int fir=0,sec=0;
        String first=s.substring(0,half);
        String second=s.substring(half);
        for(int j=0;j<first.length();j++){
            char ch=Character.toLowerCase(first.charAt(j));
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') fir++;
        }
        for(int j=0;j<second.length();j++){
            char ch=Character.toLowerCase(second.charAt(j));
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') sec++;
        }
        return fir==sec;
    }
}
