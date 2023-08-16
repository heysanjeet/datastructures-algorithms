package data_structures.array;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] sortedArray = {10, 20, 20, 30, 30, 30, 40, 40, 40};
        int result = removeDuplicate(sortedArray);
        for (int i = 0; i < result; i++) {
            System.out.print(sortedArray[i] + " ");
        }
    }

    //O(n)-time
    //O(n)-space
    private static int removeDuplicateValues(int[] array) {
        int[] temp = new int[array.length];
        temp[0] = array[0];
        int resSize = 1;
        for (int i = 1; i < array.length; i++) {
            if (temp[resSize - 1] != array[i]) {//not found duplicate value
                temp[resSize] = array[i];
                resSize++;
            }
        }
        for (int i = 0; i < resSize; i++) {
            array[i] = temp[i];
        }
        return resSize;
    }

    //better approach time O(n) space O(i)
    private static int removeDuplicate(int[] array) {
        int res = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[res - 1] != array[i]) {//not found duplicate
                array[res] = array[i];
                res++;
            }
        }
        return res;
    }
}
