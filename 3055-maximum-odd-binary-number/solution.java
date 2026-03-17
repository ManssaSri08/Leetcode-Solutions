class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count=0;
        StringBuilder result=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='1') count++;
        }
        for(int i=0;i<s.length()-1;i++){
            if(count>1){
                result.append('1');
                count--;
            }
            else result.append('0');
        }
        result.append('1');
        return result.toString();
    }
}
