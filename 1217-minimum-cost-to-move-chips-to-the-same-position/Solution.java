/*
LeetCode: 1217. Minimum Cost to Move Chips to The Same Position
Runtime: N/A
Memory: 42992000
*/

class Solution {
    public int minCostToMoveChips(int[] position) {
        int even=0,odd=0;
        for(int n:position){
            if(n%2==0)
                even++;
            else
                odd++;
        }
        return Math.min(even,odd);
    }
}
