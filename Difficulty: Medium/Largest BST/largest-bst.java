class Solution {

    static class Info {
        int size;      // size of BST in this subtree
        int min;       // minimum value in subtree
        int max;       // maximum value in subtree
        boolean isBST; // is this subtree a BST?

        Info(int size, int min, int max, boolean isBST) {
            this.size = size;
            this.min = min;
            this.max = max;
            this.isBST = isBST;
        }
    }

    static int maxBST = 0;

    static int largestBst(Node root) {
        maxBST = 0;
        solve(root);
        return maxBST;
    }

    private static Info solve(Node root) {

        // null node is BST with size 0
        if (root == null) {
            return new Info(0, Integer.MAX_VALUE, Integer.MIN_VALUE, true);
        }

        Info left = solve(root.left);
        Info right = solve(root.right);

        // Check if the subtree of this node is BST
        if (left.isBST && right.isBST &&
            left.max < root.data && root.data < right.min) {

            // valid BST
            int size = left.size + right.size + 1;
            maxBST = Math.max(maxBST, size);

            return new Info(
                size,
                Math.min(left.min, root.data),
                Math.max(right.max, root.data),
                true
            );
        }

        // Not a BST → return false with dummy range
        return new Info(
            Math.max(left.size, right.size),
            Integer.MIN_VALUE,
            Integer.MAX_VALUE,
            false
        );
    }
}
