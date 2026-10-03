/*
LeetCode: 390. Elimination Game
Runtime: 2
Memory: 43400000
*/

class Solution {
    public int lastRemaining(int n) {
        int head=1;
        int step=1;
        int remaining=n;
        boolean leftToRight=true;
        while(remaining>1){
            if(leftToRight || remaining%2==1){
                head+=step;
            }
            remaining/=2;
            step*=2;
            leftToRight=!leftToRight;
        }
        return head;
    }
}
