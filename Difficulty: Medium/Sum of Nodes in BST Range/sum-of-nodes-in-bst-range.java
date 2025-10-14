/*
class Node {
    int data;
    Node left, right;
    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int nodeSum(Node root, int l, int r) {
        ArrayList<Integer> al = new ArrayList<>();
        inorder(root, al);
        
        int sum = 0;
        for (int val : al) {
            if (val >= l && val <= r) {
                sum += val;
            }
        }
        return sum;
    }

    private void inorder(Node root, ArrayList<Integer> al) {
        if (root == null) return;
        inorder(root.left, al);
        al.add(root.data);
        inorder(root.right, al);
    }
}
