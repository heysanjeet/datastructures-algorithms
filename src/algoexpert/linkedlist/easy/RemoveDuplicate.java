package algoexpert.linkedlist.easy;

public class RemoveDuplicate {
    public static void main(String[] args) {
        //sorted singly linked list remove duplicate
        //input =linkedList=1->1->3->4->4->5->6->6, output=1->2->3->4->5->6-

    }


    // Time O(n) | space O(1)
    public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        LinkedList currentNode = linkedList;
        while (currentNode != null) {
            LinkedList currentNext = currentNode.next;
            while (currentNext != null && currentNode.value == currentNext.value) {
                currentNext = currentNext.next;
            }
            currentNode.next = currentNext;
            currentNode = currentNext;
        }
        return linkedList;
    }
}

