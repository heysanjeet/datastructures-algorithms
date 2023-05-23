package data_structures.array;

import java.util.Arrays;

public class MergeSortedArray {
    /**
     * let's say we have two sorted arrays.
     * int[] array1={0,3,4,31};
     * int[] array2={4,6,30};
     * <p>
     * output={0,3,4,4,6,30,31};
     */

    public static int[] mergeSortedArray(int[] array1, int[] array2) {
        int[] finalArray = new int[array1.length + array2.length];
        int j = 0;
        int k = 0;
        for (int i = 0; i <= finalArray.length - 1; i++) {
            if (j != array1.length && (k == array2.length || array1[j] < array2[k])) {
                finalArray[i] = array1[j];
                j++;
            } else {
                finalArray[i] = array2[k];
                k++;
            }
        }
        return finalArray;
    }

    public static void main(String[] args) {
        int[] arr = mergeSortedArray(new int[]{1,1,8,9,10}, new int[]{1,2,8,9,11,15,16});
        Arrays.stream(arr).forEach(System.out::println);
    }
}
