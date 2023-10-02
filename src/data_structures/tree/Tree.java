package data_structures.tree;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    public void insert(Node temp,int key) {
        Node root = null;

        Node newNode = new Node(key);
        if (temp == null) {
            root = newNode;
            return;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(temp);
        //traverse until you find a empty place
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();

            if (temp.left == null) {
                temp.left = new Node(key);
                break;
            } else {
                q.add(temp.left);
            }
            if (temp.right == null) {
                temp.right = new Node(key);
                break;
            } else {
                q.add(temp.right);
            }
        }
    }

    //time-O(n)
    //pace-O(h)
    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.key + " ");
            inOrder(root.right);
        }
    }

    //time-O(n)
    //pace-O(h)
    public void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    //time-O(n)
    //pace-O(h)
    public void postOrder(Node root) {
        if (root != null) {
            preOrder(root.left);
            preOrder(root.right);
            System.out.print(root.key + " ");
        }
    }
}
