/*
LeetCode: 404. Sum of Left Leaves
Runtime: N/A
Memory: 43200000
*/

class Solution {
    public int left=0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null) return 0;
        solve(root);
        return left;
    }
    public void solve(TreeNode root){
        if(root==null) return;
        if(root.left!=null && root.left.left==null && root.left.right==null){
            left+=root.left.val;
        }
        solve(root.left);
        solve(root.right);
    }
}
