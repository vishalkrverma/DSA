/* class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}*/
class Solution {
    static Node segregate(Node head) {
        // code here
        Node zeroD=new Node(0), zero=zeroD;
        Node oneD=new Node(1), one=oneD;
        Node twoD=new Node(2), two=twoD;
        
        Node curr=head;
        
        while(curr!=null){
            if(curr.data==0){
                zero.next=curr;
                zero=zero.next;
            }
            else if(curr.data==1){
                one.next=curr;
                one=one.next;
            }
            else{
                two.next=curr;
                two=two.next;
            }
            curr=curr.next;
        }
        zero.next=(oneD.next!=null)?oneD.next:twoD.next;
        one.next=twoD.next;
        two.next=null;
        return zeroD.next;
    }
}