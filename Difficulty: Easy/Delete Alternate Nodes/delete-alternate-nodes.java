/*
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    public void deleteAlt(Node head) {
        
        if(head==null) return ;
        // Code Here
        Node temp=head;
        
        while(temp!=null && temp.next!=null){
            Node curr=temp.next;
            temp.next=curr.next;
            temp=curr.next;
        }
        // return head;
    }
}