/*
LeetCode: 25. Reverse Nodes in k-Group
Runtime: N/A
Memory: 46228000
*/

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode current=head;
        ListNode prev=null;
        ListNode t=head;
        int count=0;
        while(t!=null && count!=k){
            t=t.next;
            count++;
        }
        if(count<k) return current;
        count=0;
        while(current!=null && count!=k){
            ListNode safe=current.next;
            current.next=prev;
            prev=current;
            current=safe;
            count++;
        }
        head.next=reverseKGroup(current,k);
        return prev;
    }
}
