package data_structures.tree.problems;

import data_structures.tree.Node;

public class LevelOrderTraversal {

    //approach first find the height of the tree.
    //then print node at distance k from the root.
    //Naive solution
    //time-O(n+nh)-O(nh)
    //space O(1)
    public void levelOrderTraversal(Node root, int k) {
        k = getHightOfTree(root);
        if (k == -1) {
            return;
        }
        if (k == 0)
            System.out.println(root.key + " ");
        else
            levelOrderTraversal(root.left, k - 1);
        levelOrderTraversal(root.right, k - 1);
    }

    private int getHightOfTree(Node root) {
        if (root == null) {
            return -1;
        }
        return Math.max(getHightOfTree(root.left), getHightOfTree(root.right)) + 1;
    }

    //Optimized solution
    public void levelOrderTraversalEfficient() {

    }
}
