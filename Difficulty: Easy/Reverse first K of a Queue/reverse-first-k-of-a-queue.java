import java.util.*;

class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        if (q == null || k > q.size() || k < 0) {
            return q; // handle invalid input
        }

        Stack<Integer> st = new Stack<>();

        // Step 1: Push first k elements into the stack
        for (int i = 0; i < k; i++) {
            st.push(q.poll());
        }

        // Step 2: Enqueue stack elements back to queue
        while (!st.isEmpty()) {
            q.offer(st.pop());
        }

        // Step 3: Move the remaining (size - k) elements to the back
        int remaining = q.size() - k;
        for (int i = 0; i < remaining; i++) {
            q.offer(q.poll());
        }

        return q;
    }
}
