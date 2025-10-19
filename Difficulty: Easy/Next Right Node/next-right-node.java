class Solution {
    Node nextRight(Node root, int key) {
        // Write your code here
        Queue<Node> q=new LinkedList<>();
        
        if(root==null) return root;
        
        q.offer(root);
        
        while(!q.isEmpty()){
            
            int size=q.size();
            
            for(int i=0;i<size;i++){
              Node curr=q.poll();
              if(curr.data==key){
                  if(i<size-1){
                      return q.peek();
                  }
                  else{
                      return new Node(-1);
                  }
              }
              
             if(curr.left!=null){
                  q.offer(curr.left);
              }  
            if(curr.right!=null){
                  q.offer(curr.right);
              }
            }
        }
        return new Node(-1);
    }
}