package data_structures.linked_list.doubly_linked_list;

public class DoublyLL {
    private Node first;
    private Node last;


    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            last = newNode;//if empty, last node will refer to the new node being created.
        } else {
            first.previous = newNode;
        }
        newNode.next = first;//the new node next field will point to the old first
        this.first = newNode;
    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;//assigning old last to newNode
            newNode.previous = last;//the old last node will be newNode previous
        }
        last = newNode;//the linked list last field should point to the new node
    }

    //assume non empty list
    public Node deleteFirst() {
        Node temp = first;
        if (first.next == null) {//if only one item in the list
            last = null;
        } else {
            first.next.previous = null;//the list first node will point to null
        }
        first = first.next;
        return temp;//return the deleted old firstnode
    }

}
