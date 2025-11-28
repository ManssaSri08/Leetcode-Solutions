class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(String str:sentences){
            int count=0;
            for(char ch:str.toCharArray()){
                if(ch==' ') count++;
            }
            max=Math.max(max,count+1);
        }
        return max;
    }
}
