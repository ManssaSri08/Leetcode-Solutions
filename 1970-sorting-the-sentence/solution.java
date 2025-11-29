class Solution {
    public String sortSentence(String s) {
        String[] words=s.split(" ");
        String[] result=new String[words.length];
        for(String str:words){
            int pos=str.charAt(str.length()-1)-'0';
            result[pos-1]=str.substring(0,str.length()-1);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<result.length;i++){
            sb.append(result[i]);
            if(i<result.length-1) sb.append(" ");
        }
        return sb.toString();
    }
}
