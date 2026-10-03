/*
LeetCode: 1523. Count Odd Numbers in an Interval Range
Runtime: N/A
Memory: 41796000
*/

class Solution {
    public int countOdds(int low, int high) {
        int result=(high+1)/2-(low/2);
        return result;
    }
}
