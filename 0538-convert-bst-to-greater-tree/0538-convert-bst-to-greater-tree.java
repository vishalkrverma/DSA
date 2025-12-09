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

    static void inorder(TreeNode root,int[] nums){
        if(root==null) return ;

        inorder(root.right,nums);
        root.val+=nums[0];
        nums[0]=root.val;
        inorder(root.left,nums);
    }

    public TreeNode convertBST(TreeNode root) {
        int[] nums=new int[1];
        inorder(root,nums);

        return root;
    }
}