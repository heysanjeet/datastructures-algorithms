package algoexpert.arrays.medium;

public class MonotonicArray {
    public static void main(String[] args) {
//input :array={-1,-5,-10,-1100,-1100,-1101,-1102, -9001}
        //true
    }

    //Time O(n) | space O(1)
    public static boolean isMonotonicBetter(int[] array) {
        boolean isNonDecreasing = true;
        boolean isNonIncreasing = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                isNonDecreasing = false;
            }
            if (array[i] > array[i - 1]) {
                isNonIncreasing = false;
            }
        }
        return isNonDecreasing || isNonIncreasing;
    }


    //Time O(n) | space O(1)
    public static boolean isMonotonic(int[] array) {
        if (array.length <= 2) {
            return true;
        }

        int direction = array[1] - array[0];
        for (int i = 2; i < array.length; i++) {
            if (direction == 0) {
                direction = array[i] - array[i - 1];
                continue;
            }
            if (breakDirection(direction, array[i - 1], array[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean breakDirection(int direction, int previous, int current) {
        int difference = current - previous;
        if (direction > 0) {
            return difference < 0;
        }
        return difference > 0;
    }

}
