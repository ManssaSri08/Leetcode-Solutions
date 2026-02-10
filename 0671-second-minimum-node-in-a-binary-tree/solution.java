class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) return -1;
        return findSecondMinimumValue(root, root.val);
    }
    private int findSecondMinimumValue(TreeNode root, int mn) {
        if (root == null) return -1;
        if (root.val > mn) return root.val;
        int left = findSecondMinimumValue(root.left, mn);
        int right = findSecondMinimumValue(root.right, mn);
        if (left == -1 || right == -1) return Math.max(left, right);
        return Math.min(left, right);
    }
}
