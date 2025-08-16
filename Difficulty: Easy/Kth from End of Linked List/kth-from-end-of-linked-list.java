/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
        Node fast=head;
        while(k>0){
            if(fast==null) return -1;
            fast=fast.next;
            k--;
        }
        Node slow=head;
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow.data;
    }
}