/*
class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
}*/

class Solution {
    public boolean isDeadEnd(Node root) {
        return isDeadEndUtil(root, 1, Integer.MAX_VALUE);
    }

    private boolean isDeadEndUtil(Node root, int min, int max) {
        if (root == null) {
            return false;
        }

        // If the range becomes invalid, there's a dead end
        if (min == max) {
            return true;
        }

        return isDeadEndUtil(root.left, min, root.data - 1) ||
               isDeadEndUtil(root.right, root.data + 1, max);
    }
}
