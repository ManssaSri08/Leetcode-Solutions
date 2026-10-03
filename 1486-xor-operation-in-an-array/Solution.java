/*
LeetCode: 1486. XOR Operation in an Array
Runtime: N/A
Memory: 41960000
*/

class Solution {
    public int xorOperation(int n, int start) {
        int result=0;
        for(int i=0;i<n;i++){
            int val=start+2*i;
            result=result^val;
        }
        return result;
    }
}
