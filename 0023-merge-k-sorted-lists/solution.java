class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0) return null;
        ListNode result=lists[0];
        for(int i=1;i<lists.length;i++){
            ListNode list1=result;
            ListNode list2=lists[i];
            ListNode dummyNode=new ListNode(0);
            ListNode tail=dummyNode;
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
            tail.next=(list1!=null)?list1:list2;
            result=dummyNode.next;
        }
        return result;
    }
}
