/*
LeetCode: 3827. Count Monobit Integers
Runtime: 1
Memory: 42552000
*/

class Solution {
    public int countMonobit(int n) {
        int count=1;
        for(int i=1;i<=n;i=(i<<1)|1){
            count++;
        }
        return count;
    }
}
