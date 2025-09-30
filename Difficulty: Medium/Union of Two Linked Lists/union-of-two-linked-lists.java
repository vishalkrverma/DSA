/*
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Solution {
    public static Node findUnion(Node head1, Node head2) {
       
       Set<Integer> set=new TreeSet<>();
       
       while(head1!=null){
           set.add(head1.data);
           head1=head1.next;
       }
       while(head2!=null){
           set.add(head2.data);
           head2=head2.next;
       }
       
      Node dummy = new Node(0); 
        Node tail = dummy;

        for (int val : set) {
            tail.next = new Node(val);
            tail = tail.next;
        }

        return dummy.next;
    }
}