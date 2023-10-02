package data_structures.tree;

public class Tree {
    public void insert(int key) {
        Node root = null;
    }

    //time-O(n)
    //pace-O(h)
    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.key + " ");
            inOrder(root.right);
        }
    }

    //time-O(n)
    //pace-O(h)
    public void preOrder(Node root) {
        if (root != null) {
            System.out.println(root.key + " ");
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
            System.out.println(root.key + " ");
        }
    }
}
