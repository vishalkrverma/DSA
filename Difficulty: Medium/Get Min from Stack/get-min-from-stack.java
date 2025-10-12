import java.util.Stack;

class SpecialStack {
    private Stack<Integer> st;
    private Stack<Integer> minStack;

    public SpecialStack() {
        st = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        st.push(x);

        // Push to minStack if it's the new minimum
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        if (st.isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        int removed = st.pop();

        if (!minStack.isEmpty() && removed == minStack.peek()) {
            minStack.pop();
        }
    }

    public int peek() {
        if (st.isEmpty()) {
            return -1;
        }
        return st.peek();
    }

    public boolean isEmpty() {
        return st.isEmpty();
    }

    public int getMin() {
        if (minStack.isEmpty()) {
            return -1;
        }
        return minStack.peek();
    }
}
