/*
LeetCode: 94. Binary Tree Inorder Traversal
Runtime: N/A
Memory: 43528000
*/

class Solution {
    List<Integer> list=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null) return list;
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
        return list;
    }
}
