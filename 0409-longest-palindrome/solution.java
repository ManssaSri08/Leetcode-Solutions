class Solution {
    public int longestPalindrome(String s) {
        int len=0;
        int[] freq=new int[128];
        for(char ch:s.toCharArray())
            freq[ch]++;
        for(int f:freq){
            len+=(f/2)*2;
            if(len%2==0 && f%2==1) len++;
        }
        return len;
    }
}
