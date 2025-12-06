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
    public ListNode insertionSortList(ListNode head) {
        ListNode dummyNode=new ListNode(0);
        ListNode sorted=head;
        ListNode current=head.next;
        dummyNode.next=head;
        while(current!=null){
            if(current.val>sorted.val){
                sorted=current;
            }
            else{
                ListNode prevNode=dummyNode;
                while(current.val>prevNode.next.val){
                    prevNode=prevNode.next;
                }
                sorted.next=current.next;
                current.next=prevNode.next;
                prevNode.next=current;
            }
            current=sorted.next;
        }
        return dummyNode.next;
    }
}
