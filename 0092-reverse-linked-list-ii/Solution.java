/*
LeetCode: 92. Reverse Linked List II
Runtime: N/A
Memory: 43268000
*/

class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        for(int i=1;i<left;i++){
            prev=prev.next;
        }
        ListNode curr=prev.next;
        ListNode temp=curr.next;
        for(int i=0;i<right-left;i++){
            curr.next=temp.next;
            temp.next=prev.next;
            prev.next=temp;
            temp=curr.next;
        }
        return dummy.next;
    }
}
