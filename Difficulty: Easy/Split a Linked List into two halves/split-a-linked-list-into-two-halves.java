class Solution {
    public Pair<Node, Node> splitList(Node head) {
        Node slow = head;
        Node fast = head;

        if (head == null) {
            return new Pair(null, null);
        }

        // For odd nodes, fast.next is head and
        // for even nodes, fast.next.next is head
        while (fast.next != head && 
               fast.next.next != head) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // If there are even elements in 
      	// the list then move fast
        if (fast.next.next == head) {
            fast = fast.next;
        }

        // Set the head pointer of the first half
        Node head1 = head;

        // Set the head pointer of the second half
        Node head2 = slow.next;

        // Make the second half circular
        fast.next = slow.next;

        // Make the first half circular
        slow.next = head;

        return new Pair(head1, head2);
    }
}