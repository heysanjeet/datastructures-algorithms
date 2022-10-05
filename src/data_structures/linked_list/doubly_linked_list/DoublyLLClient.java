package data_structures.linked_list.doubly_linked_list;

public class DoublyLLClient {
    public static void main(String[] args) {
        DoublyLL linkedList=new DoublyLL();
        //System.out.println(linkedList.isEmpty());
        linkedList.insertFirst(1);
        linkedList.insertFirst(20);
        linkedList.insertFirst(300);
        linkedList.insertFirst(40);
        linkedList.insertFirst(55);
        linkedList.insertFirst(60);
        /*System.out.println(linkedList.isEmpty());
        System.out.println(linkedList.deleteFirst().data);
        System.out.println(linkedList.isEmpty());
        System.out.println(linkedList.isEmpty());*/
        System.out.println(linkedList.isEmpty());
        linkedList.printLL();

    }
}
