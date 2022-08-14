package data_structures.linked_list;

public class SinglyLinkedList {
    public Node first;

    public SinglyLinkedList() {

    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int value) {
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = first;//new node will point to the old first
        first = newNode;//we make new node is first

    }

    public Node deleteFirst() {
        Node temp = first;//we get the first node
        first = first.next;//we assign first not node to first
        return temp;
    }

    public void insertLast(int data) {
        Node current = first;
        while (current.next != null) {
            current = current.next;//loop until current.next is null
        }
        Node newNode = new Node();
        newNode.data = data;
        current.next = newNode;
    }

    public void displayList() {
        System.out.println("Displaying nodes");
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

}
