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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyNode=new ListNode(0);
        dummyNode.next=head;
        ListNode current=head;
        ListNode sorted=dummyNode;
        while(current!=null && current.next!=null){
            if(current.val==current.next.val){
                while(current.next!=null && current.val==current.next.val){
                    current=current.next;
                }
                sorted.next=current.next;
            }
            else{
                sorted=sorted.next;
            }
            current=current.next;
        }
        return dummyNode.next;
    }
}
