/* Structure of LinkedList
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/
class Solution {
    boolean isCircular(Node head) {
        if(head==null) return true;
        // Your code here
        Node first=head.next;
        while(first!=null && first!=head){
            first=first.next;
        }
        return first==head;
    }
}