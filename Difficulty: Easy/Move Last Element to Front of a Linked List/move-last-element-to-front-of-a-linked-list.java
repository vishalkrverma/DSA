/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static Node moveToFront(Node head) {
        // code here
        if(head==null) return head;
        
        Node temp=head;
        
        
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next.next=head;
        head=temp.next;
        temp.next=null;
        return head;
    }
}
