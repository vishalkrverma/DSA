/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    public static Node findIntersection(Node head1, Node head2) {
       Node l1=head1;
       Node l2=head2;
       
       Node dummy=new Node(0);
       Node temp=dummy;
       
       while(l1!=null && l2!=null){
           
           if(l1.data==l2.data){
               temp.next=new Node(l1.data);
               temp=temp.next;
               l1=l1.next;
               l2=l2.next;
           }
           
          else if(l1.data<l2.data){
               l1=l1.next;
           }
           else{
               l2=l2.next;
           }
       }
       return dummy.next;
    }
}