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
    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) return false;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean foundX = false;
            boolean foundY = false;

            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();

                if (curr.val == x) foundX = true;
                if (curr.val == y) foundY = true;

                // Check if x and y are children of the same parent
                if (curr.left != null && curr.right != null) {
                    int l = curr.left.val;
                    int r = curr.right.val;
                    if ((l == x && r == y) || (l == y && r == x)) {
                        return false; // Same parent → not cousins
                    }
                }

                if (curr.left != null) queue.offer(curr.left);
                if (curr.right != null) queue.offer(curr.right);
            }

            if (foundX && foundY) return true; // Found both at same level with different parents
            if (foundX || foundY) return false; // Found only one at this level → can't be cousins
        }

        return false;
    }
}
