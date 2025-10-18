class myQueue {
    int[] arr;
    int front = 0;
    int rear = 0;
    int size = 0;

    public myQueue(int n) {
        arr = new int[n];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }

    public void enqueue(int x) {
        if (!isFull()) {
            arr[rear] = x;
            rear = (rear + 1) % arr.length;
            size++;
        }
    }

    public void dequeue() {
        if (!isEmpty()) {
            front = (front + 1) % arr.length;
            size--;
        }
    }

    public int getFront() {
        if (!isEmpty()) {
            return arr[front];
        }
        return -1;  // Instead of throwing exception
    }

    public int getRear() {
        if (!isEmpty()) {
            return arr[(rear - 1 + arr.length) % arr.length];
        }
        return -1;  // Instead of throwing exception
    }
}
