/*
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public static void postOrder(ArrayList<Integer> al,Node root){
        if(root==null) return;
        
        postOrder(al,root.left);
        postOrder(al,root.right);
        al.add(root.data);
    }
    
    
    public ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> al=new ArrayList<>();
        
        if(root==null) return al;
       
        postOrder(al,root);
       
        return al;
        
    }
}