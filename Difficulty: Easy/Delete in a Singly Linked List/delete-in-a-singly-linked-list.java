/*
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
    Node deleteNode(Node head, int x) {
        
        if((head==null || head.next==null) && x==1) return null; 
        // code here
        int cnt=1;
        Node dummy=new Node(0);
        dummy.next=head;
        Node temp=dummy;
        while(cnt<x){
            temp=temp.next;
            cnt++;
        }
        temp.next=temp.next.next;
        return dummy.next;
    }
}