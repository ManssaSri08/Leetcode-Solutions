/*
LeetCode: 113. Path Sum II
Runtime: 1
Memory: 45268000
*/

class Solution {
    public int sum=0;
    public List<Integer> list=new ArrayList<>();
    public List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root==null) return res;
        solve(root,targetSum,0);
        return res;
    }
    public void solve(TreeNode root, int targetSum, int sum){
        sum+=root.val;
        list.add(root.val);
        if(root.left==null && root.right==null){
            if(sum==targetSum){
                res.add(new ArrayList<>(list));
            }
        }
        if(root.left!=null)
            solve(root.left,targetSum,sum);
        if(root.right!=null)
            solve(root.right,targetSum,sum);
        list.remove(list.size()-1);
    }
}
