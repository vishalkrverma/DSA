/*Complete The given function
The Node class is as follows:
class Node{
    int data;
    Node left,right;

    Node(int d)
     {
      data=d;
      left=null;
      right=null;
    }
}*/
class Solution {
    public ArrayList<Integer> extremeNodes(Node root) {
       ArrayList<Integer> al=new ArrayList<>();
       
       if(root==null) return al;
       
       Queue<Node> q=new LinkedList<>();
       boolean left=false;
       
       q.add(root);
       
       while(!q.isEmpty()){
           int size=q.size();
           
           int first=-1, last=-1;
           
           for(int i=0;i<size;i++){
               
               Node curr=q.poll();
               
               if(i==0) first=curr.data;
               
               if(i==size-1) last=curr.data;
               
               if(curr.left!=null) q.add(curr.left);
               
               if(curr.right!=null) q.add(curr.right);
           }
           
           if(left){
               al.add(first);
           }
           else{
               al.add(last);
           }
           left=!left;
       }
       return al;
    }
}