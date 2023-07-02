package data_structures.array;

public class FindMaxValue {
    public static void main(String[] args) {
        int[] array = {56, 6, 43, 98, 57, 52, 3, 10};
        System.out.println(findMaxValue(array));//98
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
