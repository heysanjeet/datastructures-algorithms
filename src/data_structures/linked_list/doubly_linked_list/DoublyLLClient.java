package data_structures.linked_list.doubly_linked_list;

public class DoublyLLClient {
    public static void main(String[] args) {
        DoublyLL linkedList=new DoublyLL();
        System.out.println(linkedList.isEmpty());
        linkedList.insertFirst(1);
        System.out.println(linkedList.isEmpty());
        System.out.println(linkedList.deleteFirst().data);
        System.out.println(linkedList.isEmpty());
        System.out.println(linkedList.isEmpty());
    }
}
