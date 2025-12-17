class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode lhead=null,ltail=null;
        ListNode ghead=null,gtail=null;
        ListNode temp=head;
        while(temp!=null){
            ListNode next=temp.next;
            temp.next=null;
            if(temp.val<x){
                if(lhead==null){
                    lhead=ltail=temp;
                }
                else{
                    ltail.next=temp;
                    ltail=temp;
                }
            }
            else if(temp.val>=x){
                if(ghead==null){
                    ghead=gtail=temp;
                }
                else{
                    gtail.next=temp;
                    gtail=temp;
                }
            }
            temp=next;
        }
        if(lhead==null) return ghead;
        ltail.next=ghead;
        return lhead;
    }
}
