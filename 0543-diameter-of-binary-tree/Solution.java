/*
LeetCode: 543. Diameter of Binary Tree
Runtime: 1
Memory: 47068000
*/

class Solution {
    public int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        solve(root);
        return diameter;
    }
    public int solve(TreeNode root){
        if(root==null) return 0;
        int left=solve(root.left);
        int right=solve(root.right);
        diameter=Math.max(diameter,left+right);
        return 1+Math.max(left,right);
    }
}
