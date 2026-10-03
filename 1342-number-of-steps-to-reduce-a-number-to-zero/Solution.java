/*
LeetCode: 1342. Number of Steps to Reduce a Number to Zero
Runtime: N/A
Memory: 41952000
*/

class Solution {
    public int numberOfSteps(int num) {
        int count=0;
        while(num>0){
            if(num%2==0){
                num=num/2; count++;
            }
            else{
                num=num-1; count++;
            }
        }
        return count;
    }
}
