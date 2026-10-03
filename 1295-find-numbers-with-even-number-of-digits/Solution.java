/*
LeetCode: 1295. Find Numbers with Even Number of Digits
Runtime: 1
Memory: 44496000
*/

class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
            if(num>0){
                if(((int)Math.log10(num)+1)%2==0) count++;
            }
        }
        return count;
    }
}
