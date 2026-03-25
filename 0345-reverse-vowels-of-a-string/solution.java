class Solution {
    public String reverseVowels(String s) {
        int n=s.length();
        int start=0,end=n-1;
        char[] ch=s.toCharArray();
        while(start<end){
            if(!isVowel(ch[start])) start++;
            else if(!isVowel(ch[end])) end--;
            else{
                char temp=ch[start];
                ch[start]=ch[end];
                ch[end]=temp;
                start++;
                end--;
            }
        }
        return new String(ch);
    }
    public boolean isVowel(char ch){
        return (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U');
    }
}
