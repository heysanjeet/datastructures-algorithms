package data_structures.linked_list.singly_linked_list;

public class SinglyLLClient {
    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.insertFirst(10);
        linkedList.insertFirst(20);
        linkedList.insertFirst(98);
        linkedList.insertFirst(700);
        linkedList.insertFirst(78);
        linkedList.insertFirst(955);
        linkedList.insertLast(100);
        //System.out.println(linkedList.isEmpty());
        //linkedList.deleteFirst();
        linkedList.displayList();
    }
}
