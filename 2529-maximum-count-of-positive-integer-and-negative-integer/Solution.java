/*
LeetCode: 2529. Maximum Count of Positive Integer and Negative Integer
Runtime: 1
Memory: 46892000
*/

class Solution {
    public int maximumCount(int[] nums) {
        int pos=0,neg=0;
        for(int num:nums){
            if(num<0) neg++;
            else if(num>0)  pos++;
        }
        return Math.max(pos,neg);
    }
}
