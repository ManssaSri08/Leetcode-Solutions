/*
LeetCode: 2283. Check if Number Has Equal Digit Count and Digit Value
Runtime: 1
Memory: 43356000
*/

class Solution {
    public boolean digitCount(String num) {
        char[] arr=num.toCharArray();
        Map<Integer,Integer> map=new HashMap<>();
        for(char ch:num.toCharArray()){
            int n=ch-'0';
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int i=0;i<num.length();i++){
            int a=num.charAt(i)-'0';
            if(map.getOrDefault(i,0)!=a) return false;
        }
        return true;
    }
}
