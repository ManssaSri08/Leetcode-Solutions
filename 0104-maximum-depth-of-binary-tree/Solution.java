/*
LeetCode: 104. Maximum Depth of Binary Tree
Runtime: N/A
Memory: 47372000
*/

class Solution {
    public int max=Integer.MIN_VALUE, len=0;
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        solve(root,len);
        return max;
    }
    public void solve(TreeNode root,int len){
        if(root==null) return;
        len+=1;
        if(root.left==null && root.right==null){
            max=Math.max(max,len);
            len=0;
        }
        solve(root.left,len);
        solve(root.right,len);
    }
}
