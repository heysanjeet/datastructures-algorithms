package algoexpert.bst.easy;

public class FindClosestValueInBst {
    public static void main(String[] args) {

    }


    public static int findClosestValueInBst(BST tree, int target) {
        // Write your code here.
        return findClosestValueInBst(tree, target, tree.value);
    }

    public static int findClosestValueInBst(BST tree, int target, int closest) {
        if (Math.abs(closest - target) > Math.abs(target - tree.value)) {
            closest = tree.value;
        }
        if (target < tree.value && tree.left != null) {
            return findClosestValueInBst(tree.left, target, closest);
        } else if (target > tree.value && tree.right != null) {
            return findClosestValueInBst(tree.right, target, closest);
        } else {
            return closest;
        }
    }

    //Time average O(logn) | space O(1)
    //Worst Time O(n) | space O(1)
    public static int findClosestValueInBstIterative(BST tree, int target) {
        return findClosestValueInBstIterative(tree, target, tree.value);
    }

    public static int findClosestValueInBstIterative(BST tree, int target, int closest) {
        //lets say the closest value is infinity
        BST currentNode = tree;

        while (currentNode != null) {
            if (Math.abs(target - closest) > Math.abs(target - currentNode.value)) {
                closest = currentNode.value;
            }
            if (target < currentNode.value) {
                currentNode = currentNode.left;
            } else if (target > currentNode.value) {
                currentNode = currentNode.right;
            } else {
                break;
            }
        }
        return closest;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}

