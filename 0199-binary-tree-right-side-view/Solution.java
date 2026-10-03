/*
LeetCode: 199. Binary Tree Right Side View
Runtime: 1
Memory: 43492000
*/

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        if(root==null) return list;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=1;i<=size;i++){
                TreeNode p=q.poll();
                if(i==size){
                    list.add(p.val);
                }
                if(p.left!=null) q.offer(p.left);
                if(p.right!=null) q.offer(p.right);
            }
        }
        return list;
    }
}
