import java.util.*;

class myStack {
    Queue<Integer> q = new LinkedList<>();

    // Push element onto stack
    void push(int x) {
        q.offer(x);
        int sz = q.size();
        for (int i = 0; i < sz - 1; i++) {
            q.offer(q.poll());
        }
    }

    void pop() {
        if (!q.isEmpty()) {
            q.poll();
        }
    }

    // Get the top element
    int top() {
        if (!q.isEmpty()) {
            return q.peek();
        }
        return -1; // or throw exception
    }

    // Get current size
    int size() {
        return q.size();
    }

    // Optional: check if empty
    boolean isEmpty() {
        return q.isEmpty();
    }
}
