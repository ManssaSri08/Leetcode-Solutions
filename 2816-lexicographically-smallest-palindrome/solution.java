class Solution {
    public String makeSmallestPalindrome(String s) {
        int start=0,end=s.length()-1;
        char[] ch=s.toCharArray();
        while(start<end){
            if(ch[start]<ch[end]){
                ch[end]=ch[start];
            }
            else if(ch[end]<ch[start]){
                ch[start]=ch[end];
            }
            start++; end--;
        }
        return new String(ch);
    }
}
