/*
LeetCode: 287. Find the Duplicate Number
Runtime: 4
Memory: 82344000
*/

class Solution {
    public int findDuplicate(int[] arr) {
        int slow=arr[0],fast=arr[0];
        do{
            slow=arr[slow];
            fast=arr[arr[fast]];
        }while(slow!=fast);
        fast=arr[0];
        while(slow!=fast){
            slow=arr[slow];
            fast=arr[fast];
        }
        return slow;
    }
}
