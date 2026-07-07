class Solution {
    public String firstPalindrome(String[] words) {
        for(String w:words){
            if(isPalindrome(w)) return w;
        }
        return "";
    }
    public boolean isPalindrome(String s){
        int start=0,end=s.length()-1;
        char[] ch=s.toCharArray();
        while(start<end){
            if(ch[start]!=ch[end]) return false;
            start++; end--;
        }
        return true;
    }
}
