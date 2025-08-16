/*
class Node
{
    int data;
    Node next;

    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution {
    public static int fractional_node(Node head, int k) {
        int n = 0;
        Node temp = head;

        // Count the number of nodes
        while (temp != null) {
            n++;
            temp = temp.next;
        }

        int pos = (int) Math.ceil((double)n / k);

        // Traverse to the ceil(n / k)th node
        temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }

        return temp.data;
    }
}
