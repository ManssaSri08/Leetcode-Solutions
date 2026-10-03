/*
LeetCode: 107. Binary Tree Level Order Traversal II
Runtime: 1
Memory: 44636000
*/

class Solution {
    List<Integer> list=new ArrayList<>();
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root==null) return new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            list=new ArrayList<>();
            int size=q.size();
            while(size-- >0){
                TreeNode p=q.poll();
                list.add(p.val);
                if(p.left!=null) q.add(p.left);
                if(p.right!=null) q.add(p.right);
            }
            result.add(list);
        }
        Collections.reverse(result);
        return result;
    }
}
