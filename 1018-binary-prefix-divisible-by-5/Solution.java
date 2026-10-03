/*
LeetCode: 1018. Binary Prefix Divisible By 5
Runtime: 3
Memory: 47704000
*/

class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> result=new ArrayList<>();
        int num=0;
        for(int bit:nums){
            num=(num*2+bit)%5;
            result.add(num==0);
        }
        return result;
    }
}
