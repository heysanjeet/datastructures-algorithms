package algorithms.sorting.selection_sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] inputArray = {5, 6, 4, 8, 5, 9, 8, 3, 5, 2, 1, 0};
        int[] outputArray = selectionSort(inputArray);
        for (int i = 0; i < outputArray.length; i++) {
            System.out.print(outputArray[i] + ",");
        }
    }

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int currentMinimum = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[currentMinimum]) {// we found minimum value
                    currentMinimum = j;
                }
            }
            int temp = array[i];
            array[i] = array[currentMinimum];
            array[currentMinimum] = temp;
        }
        return array;
    }
}
