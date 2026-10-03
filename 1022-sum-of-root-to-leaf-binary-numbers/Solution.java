/*
LeetCode: 1022. Sum of Root To Leaf Binary Numbers
Runtime: N/A
Memory: 43668000
*/

class Solution {
    public int tot=0;
    public int sumRootToLeaf(TreeNode root) {
        if(root==null) return 0;
        solve(root,0);
        return tot;
    }
    public void solve(TreeNode root,int sum){
        if(root==null) return;
        sum=sum*2+root.val;
        if(root.left==null && root.right==null){
            tot+=sum; return;
        }
        solve(root.left,sum);
        solve(root.right,sum);
    }
}
