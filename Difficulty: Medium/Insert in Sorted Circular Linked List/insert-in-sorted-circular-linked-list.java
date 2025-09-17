/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node sortedInsert(Node head, int data) {
        // code here
        
        Node newNode=new Node(data);
        
        if(head==null){
            newNode.next=newNode;
            return newNode;
        }
        
        Node current=head;
        if(data<current.data){
            while(current.next!=head){
                current=current.next;
            }
            current.next=newNode;
            newNode.next=head;
            return newNode;
        }
        
            current=head;
            
           while(current.next!=head && current.next.data<data){
               current=current.next;
           }
        newNode.next=current.next;
        current.next=newNode;
                
        return head;
    }
}