/*
class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        // code here
        Node curr=head;
        Node prev=null;
        
        while(curr!=null){
            Node next=curr.next;
             curr.next=prev;
             prev=next;
             
             prev=curr;
             curr=next;
        }
        return prev;
    }
}