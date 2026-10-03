/*
LeetCode: 19. Remove Nth Node From End of List
Runtime: N/A
Memory: 43832000
*/

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || (head.next==null && n==1)) return null;
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(count==n){
            return head.next;
        }
        int pos=count-n;
        temp=head;
        for(int i=0;i<pos-1 && temp!=null;i++){
            temp=temp.next;
        }
        ListNode T=temp.next;
        temp.next=temp.next.next;
        T.next=null;
        return head;
    }
}
