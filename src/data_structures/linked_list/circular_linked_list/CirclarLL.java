package data_structures.linked_list.circular_linked_list;

public class CirclarLL {
    public Node first;
    public Node last;

    public CirclarLL() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            last = newNode;
        }
        newNode.next = first;//newNode ->old first
        first = newNode;//first place
    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;//the next value of the last node will point to the new node
            last = newNode;//we make new node we created be the last one in the list
        }
    }

    public int deleteFirst() {
        int temp = first.data;
        if (first.next == null) {
            last = null;
        }
        first = first.next;//first will point to old's next value
        return temp;
    }

    public void displayList() {
        System.out.println("Display nodes");
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }
}
