/*
LeetCode: 129. Sum Root to Leaf Numbers
Runtime: N/A
Memory: 42916000
*/

class Solution {
    public int tot=0;
    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;
        solve(root,0);
        return tot;
    }
    public void solve(TreeNode root,int sum){
        if(root==null) return;
        sum=sum*10+root.val;
        if(root.left==null && root.right==null){
            tot+=sum; return;
        }
        solve(root.left,sum);
        solve(root.right,sum);
    }
}
