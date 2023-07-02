package data_structures.array;

public class FindMinValue {
    public static void main(String[] args) {
        int[] array = {56, 6, 43, 98, 57, 52, 3, 10};
        System.out.println(findMinValue(array));//3
    }

    public static int findMinValue(int[] array) {
        int res = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[res]) {
                res = i;
            }
        }
        return array[res];
    }
}
