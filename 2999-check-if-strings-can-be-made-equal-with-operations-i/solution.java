class Solution {
    public boolean canBeEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;
        char[] ch=s1.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]!=s2.charAt(i)){
                for(int j=i+2;j<ch.length;j+=2){
                    if(ch[j]==s2.charAt(i)){
                        char temp=ch[i];
                        ch[i]=ch[j];
                        ch[j]=temp;
                        break;
                    }
                }
            }
        }
        return new String(ch).equals(s2);
    }
}
