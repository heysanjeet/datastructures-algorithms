package data_structures.linked_list.circular_linked_list;

public class CirclarLLClient {
    public static void main(String[] args) {
        CirclarLL circlarLL = new CirclarLL();
        circlarLL.insertFirst(10);
        circlarLL.insertFirst(20);
        circlarLL.insertFirst(30);
        circlarLL.insertFirst(40);
        circlarLL.insertFirst(50);
        circlarLL.insertFirst(60);
        circlarLL.insertLast(100);
        circlarLL.deleteFirst();
        circlarLL.displayList();
    }
}
