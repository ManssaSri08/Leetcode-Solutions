/*
LeetCode: 9. Palindrome Number
Runtime: 5
Memory: 44004000
*/

class Solution {
    public boolean isPalindrome(int x) {
        int rev=0,temp=x,dig;
        while(temp>0){
            dig=temp%10;
            rev=rev*10+dig;
            temp/=10;
        }
        if(rev==x){
            return true;
        }
        else{
            return false;
        }
    }
}
