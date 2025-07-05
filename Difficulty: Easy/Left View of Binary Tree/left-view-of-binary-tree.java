/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Solution {
    // Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root) {
       
        ArrayList<Integer> al=new ArrayList<>();
        if(root==null) return al;
        
        Queue<Node> q=new LinkedList<>();
        
        q.offer(root);
        while(!q.isEmpty()){
            int n=q.size();
            
          for(int i=0;i<n;i++){
              Node curr=q.poll();
              if(i==0){
                  al.add(curr.data);
              }
              if(curr.left!=null){
                  q.offer(curr.left);
              }
              if(curr.right!=null){
                  q.offer(curr.right);
              }
          }
        }
        return al;
    }
}