package data_structures.array;

public class CheckIfArraySorted {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,89};
        System.out.println(isSorted(array));//true

    }

    public static boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSortedNaive(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] <= array[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
