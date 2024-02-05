package algoexpert.bst.medium;

import java.util.List;

public class MinHeightBST {
    //3rd solution
    public static BST minHeightBst(List<Integer> array) {

        return constructMinHightBst(array, 0, array.size() - 1);
    }

    public static BST constructMinHightBst(List<Integer> array, int startIdx, int endIdx) {
        if (endIdx < startIdx) {
            return null;
        }
        int midIdx = (startIdx + endIdx) / 2;
        BST bst = new BST(array.get(midIdx));
        bst.left = constructMinHightBst(array, startIdx, midIdx - 1);
        bst.right = constructMinHightBst(array, midIdx + 1, endIdx);
        return bst;
    }


    //2nd solution
    public static BST minHeightBst2(List<Integer> array) {

        return constructMinHightBst2(array, null, 0, array.size() - 1);
    }

    public static BST constructMinHightBst2(List<Integer> array, BST bst, int startIdx, int endIdx) {
        if (endIdx < startIdx) {
            return null;
        }
        int midIdx = (startIdx + endIdx) / 2;
        BST newBstNode = new BST(array.get(midIdx));
        if (bst == null) {
            bst = newBstNode;
        } else {
            if (array.get(midIdx) < bst.value) {
                bst.left = newBstNode;
                bst = bst.left;
            } else {
                bst.right = newBstNode;
                bst = bst.right;
            }
        }
        constructMinHightBst2(array, bst, startIdx, midIdx - 1);
        constructMinHightBst2(array, bst, midIdx + 1, endIdx);
        return bst;
    }

    public static BST minHeightBst1(List<Integer> array) {
        // Write your code here.
        return constructMinHightBst1(array, null, 0, array.size() - 1);
    }

    public static BST constructMinHightBst1(List<Integer> array, BST bst, int startIdx, int endIdx) {
        if (endIdx < startIdx) {
            return null;
        }

        int midIdx = (startIdx + endIdx) / 2;
        int valueToAdd = array.get(midIdx);
        if (bst == null) {
            bst = new BST(valueToAdd);
        } else {
            bst.insert(valueToAdd);
        }
        constructMinHightBst1(array, bst, startIdx, midIdx - 1);
        constructMinHightBst1(array, bst, midIdx + 1, endIdx);
        return bst;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
            left = null;
            right = null;
        }

        public void insert(int value) {
            if (value < this.value) {
                if (left == null) {
                    left = new BST(value);
                } else {
                    left.insert(value);
                }
            } else {
                if (right == null) {
                    right = new BST(value);
                } else {
                    right.insert(value);
                }
            }
        }
    }
}
