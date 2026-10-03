/*
LeetCode: 2520. Count the Digits That Divide a Number
Runtime: N/A
Memory: 42288000
*/

class Solution {
    public int countDigits(int num) {
        int temp=num,count=0,dig;
        while(num>0){
            dig=num%10;
            if(temp%dig==0)
                count++;
            num=num/10;
        }
        return count;
    }
}
