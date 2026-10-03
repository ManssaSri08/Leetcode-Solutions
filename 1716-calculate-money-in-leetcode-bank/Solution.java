/*
LeetCode: 1716. Calculate Money in Leetcode Bank
Runtime: 1
Memory: 41036000
*/

class Solution {
    public int totalMoney(int n) {
        int tot=0,mon=1;
        while(n>0){
            for(int day=0;day<7&&n>0;day++){
                tot=tot+mon+day;
                n--;
            }
            mon++;
        }
        return tot;
    }
}
