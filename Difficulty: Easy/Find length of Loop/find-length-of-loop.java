/*
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution {
        Node slow;
        Node fast;
        
    static int count(Node slow,Node fast){
        int cnt=1;
        Node temp=slow;
        
        while(slow.next!=fast){
            slow=slow.next;
            cnt++;
        }
        return cnt;
    }    
        
    public int lengthOfLoop(Node head) {
        // code here.
        int cnt=0;
        slow=head;
        fast=head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cnt=count(slow,fast);
                return cnt;
            }
        }
        return cnt;
    }
}