/*
LeetCode: 3876. Construct Uniform Parity Array II
Runtime: 5
Memory: 121620000
*/

class Solution {
    public boolean uniformArray(int[] nums) {
        int min=Integer.MAX_VALUE;
        boolean odd=false;
        for(int num:nums){
            min=Math.min(min,num);
            if(num%2==1) odd=true;
        }
        if(min%2==1) return true;
        return !odd;
    }
}
