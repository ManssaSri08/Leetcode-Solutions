/*
LeetCode: 234. Palindrome Linked List
Runtime: 4
Memory: 94560000
*/

class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode fast=head,slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next; 
            fast=fast.next.next;
        }
        ListNode current=head, prev=null, safe=null;
        while(current!=slow){
            safe=current.next; 
            current.next=prev; 
            prev=current; 
            current=safe;
        }
        if(fast!=null){
            slow=slow.next;
        }
        ListNode p1=prev,p2=slow;
        while(p2!=null){
            if(p1.val!=p2.val){
                return false;
            }
            p1=p1.next; p2=p2.next;
        }
        return true;
    }
}
