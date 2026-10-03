/*
LeetCode: 61. Rotate List
Runtime: N/A
Memory: 44044000
*/

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return head;
        int n=0;
        ListNode temp=head;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        k=k%n;
        if(k==0) return head;
        while(k!=0){
            temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            ListNode safe=temp.next;
            temp.next=null;
            safe.next=head;
            head=safe;
            k--;
        }
        return head;
    }
}
