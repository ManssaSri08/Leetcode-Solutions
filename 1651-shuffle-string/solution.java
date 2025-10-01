class Solution {
    char find(int[] indices,String str,int search) {
        for(int ind=0;ind<indices.length;ind++) {
            if(indices[ind]==search)
                return str.charAt(ind);
        }
        return ' ';
    }
    public String restoreString(String s, int[] indices) {
        String restore=new String();
        for(int ind=0;ind<indices.length;ind++) {
            char ch=find(indices,s,ind);
            restore=restore+ch;
        }
        return restore;
    }
}
