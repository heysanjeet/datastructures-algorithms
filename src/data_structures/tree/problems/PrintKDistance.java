package data_structures.tree.problems;

import data_structures.tree.Node;

public class PrintKDistance {
    public void printKDistance(Node root, int k) {
        if (root == null) {
            return;
        }
        if (k == 0) {
            System.out.println(root.key + " ");
        }
        printKDistance(root.left, k - 1);
        printKDistance(root.right, k - 1);
    }
}
