class Solution {
    public String compressedString(String word) {
        int n=word.length(),i=0;
        StringBuilder sb=new StringBuilder();
        while(i<n){
            char ch=word.charAt(i);
            int count=0;
            while(i<n && word.charAt(i)==ch && count<9){
                count++;
                i++;
            }
            sb.append(count).append(ch);
        }
        return sb.toString();
    }
}
