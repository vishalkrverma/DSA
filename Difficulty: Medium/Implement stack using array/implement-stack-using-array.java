import java.util.*;

class myStack {
    private int[] arr;
    private int top;

    public myStack(int n) {
        arr = new int[n];
        top = 0;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public boolean isFull() {
        return top == arr.length;
    }

    public void push(int x) {
        if (!isFull()) {
            arr[top++] = x;
        }
    }

    public void pop() {
        if (!isEmpty()) {
            top--;
        }
    }
     public int peek() {
        if (!isEmpty()) {
            return arr[top - 1];
        }
        else {
        return -1;
        }
    }
}
