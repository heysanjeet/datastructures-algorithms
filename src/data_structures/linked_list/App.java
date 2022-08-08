package data_structures.linked_list;

public class App {
    public static void main(String[] args) {
        Node nodeA = new Node();
        nodeA.data = 4;

        Node nodeB = new Node();
        nodeB.data = 3;


        Node nodeC = new Node();
        nodeC.data = 7;

        Node nodeD = new Node();
        nodeD.data = 8;

        //Linked the node
        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;

        System.out.println(listLength(nodeA));//4
        System.out.println(listLength(nodeB));//3
       /* System.out.println(listLength(nodeC));//7
        System.out.println(listLength(nodeD));//8*/


    }

    public static int listLength(Node node) {
        int length = 0;
        Node currect_node = node;
        while (currect_node != null) {
            length++;
            currect_node = currect_node.next;

        }
        return length;
    }
}
