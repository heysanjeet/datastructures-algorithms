package data_structures.array;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] sortedArray = {10, 20, 20, 30, 30, 30, 40, 40, 40};
        int result = removeDuplicateValues(sortedArray);
        for (int i = 0; i < result; i++) {
            System.out.print(sortedArray[i] + " ");
        }
    }

    private static int removeDuplicateValues(int[] array) {
        int[] temp = new int[array.length];
        temp[0] = array[0];
        int resSize = 1;
        for (int i = 1; i < array.length; i++) {
            if (temp[resSize - 1] != array[i]) {//found duplicate value
                temp[resSize] = array[i];
                resSize++;
            }
        }
        for (int i = 0; i < resSize; i++) {
            array[i] = temp[i];
        }
        return resSize;
    }
}
