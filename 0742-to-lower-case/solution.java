class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if((ch>='a' && ch<='z') || !(Character.isLetter(ch))) sb.append(ch);
            else sb.append((char)(ch+32));
        }
        return sb.toString();
    }
}
