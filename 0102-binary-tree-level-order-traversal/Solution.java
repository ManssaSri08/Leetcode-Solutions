/*
LeetCode: 102. Binary Tree Level Order Traversal
Runtime: 1
Memory: 47056000
*/

class Solution {
    public List<Integer> list=new ArrayList<>();
    public List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        list.add(root.val);
        while(!q.isEmpty()){
            list=new ArrayList<>();
            int size=q.size();
            while(size-- >0){
                TreeNode p=q.poll();
                list.add(p.val);
                if(p.left!=null){
                    q.add(p.left);
                }
                if(p.right!=null){
                    q.add(p.right);
                }
            }
            result.add(list);
        }
        return result;
    }
}
