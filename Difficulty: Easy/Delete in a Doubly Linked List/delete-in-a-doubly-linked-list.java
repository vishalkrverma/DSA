/*

Definition for doubly Link List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node deleteNode(Node head, int x) {
        if (head == null) return null;

        // If head is to be deleted
        if (x == 1) {
            head = head.next;
            if (head != null) head.prev = null;
            return head;
        }

        Node temp = head;

        // Move to the (x-1)-th node
        for (int i = 1; temp != null && i < x; i++) {
            temp = temp.next;
        }

        // If position is greater than number of nodes
        if (temp == null) return head;

        // Unlink the node
        if (temp.prev != null) temp.prev.next = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;

        return head;
    }
}
