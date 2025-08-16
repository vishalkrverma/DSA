/*
Node class is as follows:

class Node {
    int data;
    Node next;

    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {

    // Return the sum of last k nodes
    public int sumOfLastN_Nodes(Node head, int n) {
        // write code here
        Node temp=head;
        
        int cnt=0;
        while(temp!=null){
            temp=temp.next;
            cnt++;
        }
        int sum=0;
        
        n=cnt-n;
        temp=head;
        while(n>0){
            temp=temp.next;
            n--;
        }
        while(temp!=null){
            sum+=temp.data;
            temp=temp.next;
        }
        return sum;
    }
}