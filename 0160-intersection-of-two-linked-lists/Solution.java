/*
LeetCode: 160. Intersection of Two Linked Lists
Runtime: 10
Memory: 52520000
*/

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp=headA;
        ListNode t=headB;
        Set<ListNode> set=new HashSet();
        while(temp!=null){
            set.add(temp);
            temp=temp.next;
        }
        while(t!=null){
            if(set.contains(t))
                return t;
            t=t.next;
        }
        return null;
    }
}
