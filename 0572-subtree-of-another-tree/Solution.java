/*
LeetCode: 572. Subtree of Another Tree
Runtime: 2
Memory: 46588000
*/

class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;
        if (isSame(root, subRoot)) return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    private boolean isSame(TreeNode p, TreeNode q) {
        if (p == null || q == null) return p == q;
        if (p.val != q.val) return false;
        return isSame(p.left, q.left) && isSame(p.right, q.right);
    }
}
