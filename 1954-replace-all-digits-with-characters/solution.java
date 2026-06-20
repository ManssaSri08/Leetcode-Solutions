class Solution {
    public String replaceDigits(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n-1;i+=2){
            char ch=s.charAt(i);
            sb.append(ch);
            int k=s.charAt(i+1)-'0';
            char ch1=(char)(ch+k);
            sb.append(ch1);
        }
        if(n%2==1) sb.append(s.charAt(n-1));
        return sb.toString();
    }
}
