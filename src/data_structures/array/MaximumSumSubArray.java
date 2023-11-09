package data_structures.array;

public class MaximumSumSubArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println(maxSumsubArrayEfficient(array));//6
    }

    //time- O(n^2)
    //should be contiguous element
    public static int maxSumsubarrayNaive(int[] array) {
        int result = array[0];
        for (int i = 0; i < array.length; i++) {
            int curr = 0;
            for (int j = i; j < array.length; j++) {
                curr = curr + array[j];
                result = Math.max(result, curr);
            }
        }
        return result;
    }


    //O(n)
    public static int maxSumsubArrayEfficient(int[] array) {
        int result = array[0];
        int currentMaxEnding = array[0];
        for (int i = 1; i < array.length; i++) {
            currentMaxEnding = Math.max(currentMaxEnding + array[i], array[i]);
            result = Math.max(result, currentMaxEnding);
        }
        return result;
    }
}
