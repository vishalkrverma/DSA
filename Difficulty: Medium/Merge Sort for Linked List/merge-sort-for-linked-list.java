/*
class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}
*/


class Solution {
    
    private Node merge(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        if (l1 != null) tail.next = l1;
        if (l2 != null) tail.next = l2;

        return dummy.next;
    }

    private Node getMiddle(Node head) {
        if (head == null || head.next == null) return head;

        Node slow = head;
        Node fast = head;
        Node prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        return prev;  // Return the node *before* the middle
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) return head;

        Node midPrev = getMiddle(head);
        Node mid = midPrev.next;
        midPrev.next = null;  // Split the list into two halves

        Node left = mergeSort(head);
        Node right = mergeSort(mid);

        return merge(left, right);
    }
}