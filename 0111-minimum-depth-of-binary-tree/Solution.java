/*
LeetCode: 111. Minimum Depth of Binary Tree
Runtime: 4
Memory: 81928000
*/

class Solution {
    public int min=Integer.MAX_VALUE, len=0;
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        findMin(root,0);
        return min;
    }
    public void findMin(TreeNode root, int len){
        len+=1;
        if(root.left==null && root.right==null){
            min=Math.min(min,len);
            len=0;
        }
        if(root.left!=null)
            findMin(root.left,len);
        if(root.right!=null)
            findMin(root.right,len);
    }
}
