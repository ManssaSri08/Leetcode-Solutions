/*
LeetCode: 1837. Sum of Digits in Base K
Runtime: N/A
Memory: 40548000
*/

class Solution {
    public int sumBase(int n, int k) {
        int sum = 0;
        while (n > 0) {
            sum += n % k; 
            n /= k;    
        }
        return sum;
    }
}

