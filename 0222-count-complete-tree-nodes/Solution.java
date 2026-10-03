/*
LeetCode: 222. Count Complete Tree Nodes
Runtime: N/A
Memory: 49424000
*/

class Solution {
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        int left=leftDepth(root);
        int right=rightDepth(root);
        if(left==right)
            return (int)(Math.pow(2,left))-1;
        return 1+countNodes(root.left)+countNodes(root.right);
    }
    public int leftDepth(TreeNode root){
        int depth=0;
        while(root!=null){
            depth++;
            root=root.left;
        }
        return depth;
    }
    public int rightDepth(TreeNode root){
        int depth=0;
        while(root!=null){
            depth++;
            root=root.right;
        }
        return depth;
    }
}
