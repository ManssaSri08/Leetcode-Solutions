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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0)
            return head;
        int length=0; ListNode t=head;
        while(t!=null){
            length++; t=t.next;
        }
        k=k%length;
        if(k==0) return head;
        for(int i=1;i<=k;i++){
            ListNode curr=head;
            ListNode prev=null;
            while(curr.next!=null){
                prev=curr;
                curr=curr.next;
            }
            prev.next=null;
            curr.next=head;
            head=curr;
        }
        return head;
    }
}
