/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        if(head.next.next==null) return (head.val+head.next.val);
        ListNode slow=head; ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next; fast=fast.next.next;
        }
        ListNode prevNode=null; ListNode nextNode=null; ListNode current=slow;
        while(current!=null){
            nextNode=current.next; current.next=prevNode;
            prevNode=current; current=nextNode;
        }
        ListNode revHead=prevNode; int max=Integer.MIN_VALUE;
        while(revHead!=null){
            max=Math.max(max,head.val+revHead.val);
            head=head.next; revHead=revHead.next;
        }
        return max;
    }
}
