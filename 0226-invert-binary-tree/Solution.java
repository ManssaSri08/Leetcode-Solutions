/*
LeetCode: 226. Invert Binary Tree
Runtime: N/A
Memory: 43020000
*/

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return root;
        solve(root);
        return root;
    }
    public void solve(TreeNode root){
        if(root==null) return;
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        solve(root.left);
        solve(root.right);
    }
}
