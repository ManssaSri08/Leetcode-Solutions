/*
LeetCode: 122. Best Time to Buy and Sell Stock II
Runtime: N/A
Memory: 46128000
*/

class Solution {
    public int maxProfit(int prices[]) {
        int profit=0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i]<prices[i+1])
                profit+=prices[i+1]-prices[i];
        }
        return profit;
    }
}
