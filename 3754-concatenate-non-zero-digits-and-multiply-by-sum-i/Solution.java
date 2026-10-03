/*
LeetCode: 3754. Concatenate Non-Zero Digits and Multiply by Sum I
Runtime: 1
Memory: 42312000
*/

class Solution {
    public long sumAndMultiply(int n) {
        int x=0,sum=0;
        String s=String.valueOf(n);
        for(int i=0;i<s.length();i++){
            int num=s.charAt(i)-'0';
            if(num>0){
                x=x*10+num;
                sum+=num;
            }
        }
        return (long)x*sum;
    }
}
