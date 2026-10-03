/*
LeetCode: 86. Partition List
Runtime: N/A
Memory: 44092000
*/

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
    public ListNode partition(ListNode head, int x) {
        ListNode temp=head;
        ListNode dummy=new ListNode();
        ListNode small=dummy;
        ListNode large=new ListNode();
        ListNode lHead=null;
        while(temp!=null){
            if(temp.val<x){
                small.next=temp;
                small=small.next;
            }
            else{
                if(lHead==null){
                    lHead=temp;
                    large.next=temp;
                    large=large.next;
                }
                else{
                    large.next=temp;
                    large=large.next;
                }
            }
            temp=temp.next;
        }
        large.next=null;
        small.next=lHead;
        return dummy.next;
    }
}
