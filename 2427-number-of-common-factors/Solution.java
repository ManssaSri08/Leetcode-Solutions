/*
LeetCode: 2427. Number of Common Factors
Runtime: 1
Memory: 42508000
*/

class Solution {
    public int commonFactors(int a, int b) {
        int min=Math.min(a,b),count=0;
        for(int i=1;i<=min;i++){
            if(a%i==0 && b%i==0){
                count++;
            }
        }
        return count;
    }
}
