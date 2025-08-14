/*
Structure of node class is:
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public Node insertInMiddle(Node head, int x) {
        // Code here
        Node curr=new Node(x);
        if(head==null) return curr;
        
        Node slow=head;
        Node fast=head;
        
        while(fast!=null && fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node temp=slow.next;
        slow.next=curr;
        curr.next=temp;
        return head;
    }
}