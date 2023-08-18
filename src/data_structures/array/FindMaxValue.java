package data_structures.array;

public class FindMaxValue {
    public static void main(String[] args) {
        int[] array = {56, 6, 43, 98, 57, 52, 3, 10};
        System.out.println(getLargestNaive(array));//98-3
    }

    public static int getLargestNaive(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean flag = true;
            for (int j = 0; j < array.length; j++) {
                if (array[j] > array[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                return i;
            }
        }
        return -1;
    }

    public static int findMaxValue(int[] array) {
        int res = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[res]) {
                res = i;
            }
        }
        return array[res];
    }
}
