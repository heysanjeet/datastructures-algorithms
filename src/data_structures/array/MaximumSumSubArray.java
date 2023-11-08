package data_structures.array;

public class MaximumSumSubArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println(maxSumsubarrayNaive(array));//6
    }

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
}
