/*
LeetCode: 1518. Water Bottles
Runtime: N/A
Memory: 40592000
*/

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count=0,empty=0;
        while(numBottles>=1)
        {
            count+=numBottles;
            empty+=numBottles;
            numBottles=empty/numExchange;
            empty=empty%numExchange;
        }
        return count;
    }
}
