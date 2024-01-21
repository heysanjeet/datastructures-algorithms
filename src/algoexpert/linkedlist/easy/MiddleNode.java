package algoexpert.linkedlist.easy;

public class MiddleNode {
    //non-empty
    //if two middle element return second one
    // input linkedList=2->7->3->5 | output=3
    public static void main(String[] args) {

    }

    //Time O(n) | space O(1)
    public LinkedList middleNode2(LinkedList linkedList) {
        LinkedList slowNode = linkedList;
        LinkedList fastNode = linkedList;
        while (fastNode != null && fastNode.next != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;// moving double than slow node
        }
        return slowNode;
    }


    //Time O(n) | space O(1)
    public LinkedList middleNode(LinkedList linkedList) {
        int count = 0;
        LinkedList currentNode = linkedList;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.next;
        }
        LinkedList middleNode = linkedList;
        for (int i = 0; i < count / 2; i++) {
            middleNode = middleNode.next;
        }
        return middleNode;
    }
}

