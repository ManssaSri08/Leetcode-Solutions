/*
LeetCode: 2011. Final Value of Variable After Performing Operations
Runtime: N/A
Memory: 42756000
*/

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int num = 0;
        for (String op : operations) {
            if (op.charAt(1) == '+') 
                num++;
            else 
                num--;
        }
        return num;
    }
}

