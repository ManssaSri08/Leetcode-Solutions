/*
LeetCode: 367. Valid Perfect Square
Runtime: N/A
Memory: 40388000
*/

class Solution {
    public boolean isPerfectSquare(int num) {
        int root = (int) Math.sqrt(num);
        return root * root == num;
    }
}
