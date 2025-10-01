/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node intersectPoint(Node head1, Node head2) {
        
        if(head1==null || head2==null) return null;
        
        Node ptr1=head1;
        Node ptr2=head2;
        
        while(ptr1 != ptr2){
            ptr1=(ptr1==null)?head2:ptr1.next;
            ptr2=(ptr2==null)?head1:ptr2.next;
        }
        return ptr1;
    }
}