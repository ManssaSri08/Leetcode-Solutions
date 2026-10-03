/*
LeetCode: 144. Binary Tree Preorder Traversal
Runtime: N/A
Memory: 42888000
*/

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        preorder(root,list);
        return list;
    }
    public void preorder(TreeNode root,List<Integer> list){
        if(root==null) return;
        list.add(root.val);
        preorder(root.left,list);
        preorder(root.right,list);
    }
}
