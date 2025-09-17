// your task is to complete this function

/*class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

import java.util.HashSet;

class Solution {
    // Function to count pairs in two linked lists whose sum is equal to x
    public int countPairs(Node head1, Node head2, int x) {
        int count = 0;
        HashSet<Integer> set = new HashSet<>();

        // Add all elements of second list to the set
        while (head2 != null) {
            set.add(head2.data);
            head2 = head2.next;
        }

        // Traverse the first list and check for complement
        while (head1 != null) {
            if (set.contains(x - head1.data)) {
                count++;
            }
            head1 = head1.next;
        }

        return count;
    }
}
