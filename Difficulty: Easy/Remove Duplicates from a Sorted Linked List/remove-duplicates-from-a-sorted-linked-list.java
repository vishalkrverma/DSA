/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Solution {
    Node removeDuplicates(Node head) {
     
        Node temp=head;
        
        while(temp!=null && temp.next!=null){
            if(temp.data==temp.next.data){
                temp.next=temp.next.next;
            }
            else{
            temp=temp.next;
            }
        }
        return head;
    }
}