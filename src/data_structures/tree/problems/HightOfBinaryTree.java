package data_structures.tree.problems;

import data_structures.tree.Node;

public class HightOfBinaryTree {
    //hight of tree is maximum number of nodes from root to leaf path-
    //we use other terms inserted of counting node we count edges

    public int hight(Node root) {
        if (root == null) {
            return 0;
        }
        return Math.max(hight(root.left), hight(root.right)) + 1;
    }


}
