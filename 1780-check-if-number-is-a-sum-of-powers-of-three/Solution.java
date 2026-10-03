/*
LeetCode: 1780. Check if Number is a Sum of Powers of Three
Runtime: N/A
Memory: 40280000
*/

class Solution {
    public boolean checkPowersOfThree(int n) {
        while(n>0){
            if(n%3==2)
            return false;
            n/=3;
        }
        return true;
    }
}
