/*
LeetCode: 21. Merge Two Sorted Lists
Runtime: N/A
Memory: 43948000
*/

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode();
        ListNode tail=dummy;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                tail.next=list1;
                list1=list1.next;
            }
            else{
                tail.next=list2;
                list2=list2.next;
            }
            tail=tail.next;
        }
        if(list1!=null) tail.next=list1;
        else tail.next=list2;
        tail.next=(list1!=null)?list1:list2;
        return dummy.next;
    }
}
