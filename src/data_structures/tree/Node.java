package data_structures.tree;

public class Node {
    public int key;
    public Node left;
    public Node right;

    public Node(int key) {
        this.key = key;
        left = null;
        right = null;
    }
}
