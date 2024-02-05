package algoexpert.bst.medium;

public class FindClosestValueInBST {


    //2nd solution
    //Average time  O(log(n)) |space O(1)
    //worst O(n) | space O(1)
    public static int findClosestValueInBst2(BST tree, int target) {
        // Write your code here.
        return findClosestValueInBst2(tree, target, tree.value);
    }

    public static int findClosestValueInBst2(BST tree, int target, int closest){
        if(Math.abs(closest-target)> Math.abs(target-tree.value)){
            closest=tree.value;
        }if(target<tree.value && tree.left !=null){
            return findClosestValueInBst(tree.left, target, closest);
        }else if(target > tree.value && tree.right !=null){
            return findClosestValueInBst(tree.right, target, closest);
        }else{
            return closest;
        }
    }

    //Average time  O(log(n)) |space O(log(n))
    //worst O(n) | space O(n)
    public static int findClosestValueInBst(BST tree, int target) {
        // Write your code here.
        return findClosestValueInBst(tree, target, tree.value);
    }

    public static int findClosestValueInBst(BST tree, int target, int closest) {
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
