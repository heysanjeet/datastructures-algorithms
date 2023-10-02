package data_structures.tree;

public class TreeClient {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);

        Tree tree = new Tree();
        tree.inOrder(root);
        System.out.print("--------------------");
        tree.insert(root, 12);

        tree.inOrder(root);
    }
}
