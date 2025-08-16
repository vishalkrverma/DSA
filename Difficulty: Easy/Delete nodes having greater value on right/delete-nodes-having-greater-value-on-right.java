/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class Solution {
    
    Node reverse(Node head){
        
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    
    Node compute(Node head) {
        head=reverse(head);
        
        Node curr=head;
        int maxSoFar=curr.data;
        Node result=curr;
        
        curr=curr.next;
        Node prev=result;
        
        while(curr!=null){
            if(curr.data>=maxSoFar){
                maxSoFar=curr.data;
                prev.next=curr;
                prev=curr;
            }
            curr=curr.next;
        }
        prev.next=null;
        return reverse(result);
    }
    
}