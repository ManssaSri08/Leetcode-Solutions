/*
LeetCode: 3622. Check Divisibility by Digit Sum and Product
Runtime: N/A
Memory: 42512000
*/

class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0, product = 1;
        int x = n;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            sum += digit;
            product *= digit;
        }
        return n % (sum + product) == 0;
    }
}
