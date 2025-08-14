/*
class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;

    DLLNode(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public DLLNode reverseDLL(DLLNode head) {
        if (head == null || head.next == null) return head;

        DLLNode curr = head;
        DLLNode prev = null;

        while (curr != null) {
            // Swap prev and next
            DLLNode temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;

            prev = curr; // keep track of the new head
            curr = curr.prev; // move to the "next" node (which is prev now)
        }

        return prev; // new head after reversal
    }
}
