class Solution {
    public int titleToNumber(String columnTitle) {
        int val=0;
        for(char ch:columnTitle.toCharArray()){
            val=val*26+(ch-'A'+1);
        }
        return val;
    }
}
