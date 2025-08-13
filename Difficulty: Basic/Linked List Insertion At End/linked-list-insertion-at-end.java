/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        Node curr=new Node(x);
        if(head==null) head=curr;;
        // code here
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        
        temp.next=curr;
        temp=temp.next;
        temp.next=null;
        
        return head;
    }
}