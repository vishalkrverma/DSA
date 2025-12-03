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

    private int helper(TreeNode root,int value){
        if(root==null) return 0;

        int count=0;

        if(root.val>=value){
            count=1;
        }

        value=Math.max(root.val,value);
        count+=helper(root.left,value);
        count+=helper(root.right,value);

        return count;
    }


    public int goodNodes(TreeNode root) {
        return helper(root,root.val);
    }
}