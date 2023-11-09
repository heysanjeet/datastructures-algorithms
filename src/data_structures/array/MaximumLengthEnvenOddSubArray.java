package data_structures.array;

public class MaximumLengthEnvenOddSubArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 7, 9};
        System.out.println(maximumLengthEnvenOddSubArray(array));//5
    }

    /* Input: a[] = {1, 2, 3, 4, 5, 7, 9}
     Output: 5
     Explanation:
     The subarray {1, 2, 3, 4, 5} has alternating even and odd elements.*/
    public static int maximumLengthEnvenOddSubArray(int array[]) {
        int result = 1;
        for (int i = 0; i < array.length; i++) {
            int currentLength = 1;
            for (int j = 1; j < array.length; j++) {
                if ((array[j] % 2 == 0 && array[j - 1] % 2 != 0) || (array[j] % 2 != 0 && array[j - 1] % 2 == 0)) {
                    currentLength++;
                } else {
                    break;
                }
            }
            result = Math.max(result, currentLength);
        }
        return result;
    }
}
