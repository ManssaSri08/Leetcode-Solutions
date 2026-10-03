/*
LeetCode: 136. Single Number
Runtime: 1
Memory: 46912000
*/

class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        for(int n:nums){
            res^=n;
        }
        return res;
    }
}
