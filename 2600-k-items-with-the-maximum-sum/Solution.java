/*
LeetCode: 2600. K Items With the Maximum Sum
Runtime: 1
Memory: 42856000
*/

class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(k<=numOnes) return k;
        if(k<=numOnes+numZeros) return numOnes;
        int remaining=k-numOnes-numZeros;
        return numOnes-remaining;
    }
}
