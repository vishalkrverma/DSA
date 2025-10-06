// Node class
/* class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
} */

// Stack class
class myStack {
    
private Node head;
private Node curr;
    
    public myStack() {
        head=new Node(0);
    }

    public boolean isEmpty() {
        return head.next==null;
    }

    public void push(int x) {
        Node temp=new Node(x);
        temp.next=head.next;
        head.next=temp;
    }

    public void pop() {
      if (!isEmpty()) {
            head.next = head.next.next;
        }
    }

    public int peek() {
        if(!isEmpty()) {
            return head.next.data;
        }
        else {
            return -1;
        }
    }

    public int size() {
        int cnt=0;
        Node temp=head.next;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        return cnt;
    }
}
