package data_structures.stacks.implementation_using_LL;

public class StackLL {
    public Node head;
    public int size;

    public StackLL() {
        size = 0;
        head = null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public int pop() {
        int old_value = head.data;
        head = head.next;
        size--;
        return old_value;
    }

    public int peek() {
        return head.data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty(){
        return (head==null);
    }
}
