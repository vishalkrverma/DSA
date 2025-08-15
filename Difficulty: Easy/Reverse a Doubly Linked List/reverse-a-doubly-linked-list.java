/*
class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;

    DLLNode(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
    class Solution {
        public DLLNode reverseDLL(DLLNode head) {
          if(head==null) return head;
            
          DLLNode curr=head;
          DLLNode temp=null;
          
          while(curr!=null){
              temp=curr.prev;
              curr.prev=curr.next;
              curr.next=temp;
            //   pre=curr;
              curr=curr.prev;
              
          }
          if(temp!=null){
              head=temp.prev;
          }
          
          return head;
        }
    }
