/*
LeetCode: 137. Single Number II
Runtime: 2
Memory: 44764000
*/

class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;

        for(int i=0;i<32;i++) {
            int count = 0;

            for(int n:nums)
                count += (n >> i) & 1;

            if(count % 3 != 0)
                ans |= (1 << i);
        }

        return ans;
    }
}
