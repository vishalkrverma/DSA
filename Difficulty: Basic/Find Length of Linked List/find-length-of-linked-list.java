/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution {
    public int getCount(Node head) {
        // code here
        int cnt=0;
        if(head==null) return cnt;
        while(head!=null){
            cnt++;
            head=head.next;
        }
        return cnt;
    }
}