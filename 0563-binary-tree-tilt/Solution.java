/*
LeetCode: 563. Binary Tree Tilt
Runtime: N/A
Memory: 46632000
*/

class Solution {
    public int tilt=0;
    public int findTilt(TreeNode root) {
        solve(root);
        return tilt;
    }
    public int solve(TreeNode root){
        if(root==null)
            return 0;
        int left=solve(root.left);
        int right=solve(root.right);
        tilt+=Math.abs(left-right);
        return left+right+root.val;
    }
}
