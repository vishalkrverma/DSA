/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> al=new ArrayList<>();

        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return al;
        q.offer(root);

        while(!q.isEmpty()){
            int n=q.size();
            List<Integer> inner=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode curr=q.poll();
                inner.add(curr.val);
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        al.add(inner);
        }
return al;
    }
}