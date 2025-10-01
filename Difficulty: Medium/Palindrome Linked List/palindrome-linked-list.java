/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    
    static Node reverse(Node slow){
        Node curr=slow;
        Node prev=null;
        Node next=null;
        
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    
    public boolean isPalindrome(Node head) {
        Node slow=head;
        Node fast=head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node temp=reverse(slow);
        
        
        while(temp!=null){
            if(head.data!=temp.data) return false;
            head=head.next;
            temp=temp.next;
        }
        return true;
    }
}