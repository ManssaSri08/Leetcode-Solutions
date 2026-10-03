/*
LeetCode: 66. Plus One
Runtime: N/A
Memory: 43336000
*/

class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--)
        {
            if(digits[i]<9)
            {
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] arr=new int[digits.length+1];
        arr[0]=1;
        return arr;
    }
}


