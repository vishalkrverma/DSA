/* node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    public Node pairwiseSwap(Node head) {
        // code here
       Node a=head;
       Node b=head;
       Node c=head;
       
       Node prev=null;
       
       while(a!=null && a.next!=null){
           b=a.next;
           c=b.next;
           
           if(a==head){
               head=b;
           }
           else{
               prev.next=b;
           }
           b.next=a;
           a.next=c;
           prev=a;
           a=c;
       }
       return head;
    }
}