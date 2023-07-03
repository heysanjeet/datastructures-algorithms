package data_structures.array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {32, 43, 56, 48, 7, 2, 34, 4, 31, 52, 63, 54};
        int[] resultArray = reverseArray(array);
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + " ");
        }
    }

    public static int[] reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int team = array[start];
            array[start] = array[end];
            array[end] = team;
            start++;
            end--;
        }
        return array;
    }
}
