/*
LeetCode: 3432. Count Partitions with Even Sum Difference
Runtime: N/A
Memory: 43468000
*/

class Solution {
    public int countPartitions(int[] nums) {
        int total=0;
        for(int num:nums){
            total+=num;
        }
        if(total%2!=0) return 0;
        return nums.length-1;
    }
}
