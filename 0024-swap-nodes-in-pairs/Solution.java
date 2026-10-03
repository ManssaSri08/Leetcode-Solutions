/*
LeetCode: 24. Swap Nodes in Pairs
Runtime: N/A
Memory: 43072000
*/

class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode temp=dummy;
        while(temp.next!=null && temp.next.next!=null){
            ListNode first=temp.next;
            ListNode second=temp.next.next;
            first.next=second.next;
            second.next=first;
            temp.next=second;
            temp=first;
        }
        return dummy.next;
    }
}
