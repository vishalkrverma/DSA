/* structure of list Node:

class Node
{
    int data;
    Node next;

    Node(int a)
        {
            data = a;
            next = null;
        }
}

*/

class Solution {
    // Function to find the intersection of two linked lists
    public Node findIntersection(Node head1, Node head2) {
       Node temp=head2;
       
       HashSet<Integer> set=new HashSet<>();
       
       while(temp!=null){
           set.add(temp.data);
           temp=temp.next;
       }
        Node dummy = new Node(0);
        Node tail = dummy;

        temp = head1;

        // Check for intersection and build new list
        while (temp != null) {
            if (set.contains(temp.data)) {
                tail.next = new Node(temp.data);  // Create a new node
                tail = tail.next;
            }
            temp = temp.next;
        }

        return dummy.next;
    }
}