/*
LeetCode: 3512. Minimum Operations to Make Array Sum Divisible by K
Runtime: 1
Memory: 46424000
*/

class Solution {
    public int minOperations(int[] nums, int k) {
        long sum=0;
        for(int num:nums){
            sum+=num;
        }
        return (int) (sum%k);
    }
}
