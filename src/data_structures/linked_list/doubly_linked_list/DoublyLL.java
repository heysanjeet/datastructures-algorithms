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
        return temp;//return the deleted old first node
    }

    //assume non empty list
    public Node deleteLast() {
        Node temp = last;
        if (first.next == null) {//we only have one node in the list
            first = null;
        } else {
            last.previous.next = null;//the last node previous node next field point to null
        }
        last = last.previous;
        return temp;
    }

    //assume non empty list
    public boolean insertAfter(int key, int data) {
        Node current = first;//we start from the beaning of the list
        while (current.data != key) {//as long, we have not found the key in the particular list
            current = current.next;
            if (current == null) {
                return false;
            }

        }
        Node newNode = new Node();
        newNode.data = data;

        if (current == last) {
            current.next = null;
            last = newNode;
        } else {
            newNode.next = current.next;//new node next field should be point to the node ahead of current one
            current.next.previous = newNode;//the node ahead of current, its previous field should point to the new node
        }
        newNode.previous = current;
        current.next = newNode;

        return true;
    }

    public Node deleteKey(int key) {
        Node current = first;//start from the beginning
        while ((current.data != key)) {
            current = current.next;
            if (current == null) {
                return null;
            }
        }
        if (current == first) {
            first = current.next;
        } else {
            current.previous.next = current.next;
        }
        if (current == last) {
            last.previous = current.previous;
        } else {
            current.next.previous = current.previous;
        }
        return current;
    }
   public void printLL(){
        Node current=first;
        while (current !=null){
            current.displayNode();
            current=current.next;
        }
   }
}
