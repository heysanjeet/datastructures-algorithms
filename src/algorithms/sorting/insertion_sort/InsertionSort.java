package algorithms.sorting.insertion_sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] inputArray = {1, 4, 6, 5, 9, 9, 2, 0, 3, 2, 1, 6, 43};
        int[] resultArray = insertionSort(inputArray);
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i]+" ");
        }

    }

    private static int[] insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {//found minimum-> swap the position
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        return array;
    }
}
