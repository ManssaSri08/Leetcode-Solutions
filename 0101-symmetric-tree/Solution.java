/*
LeetCode: 101. Symmetric Tree
Runtime: N/A
Memory: 43612000
*/

class Solution {
    public boolean isSymmetric(TreeNode root) {
        return solve(root.left,root.right);
    }
    public boolean solve(TreeNode left, TreeNode right){
        if(left==null && right==null) return true;
        if(left==null || right==null) return false;
        if(left.val!=right.val) return false;
        return solve(left.left,right.right) && solve(left.right,right.left);
    }
}
