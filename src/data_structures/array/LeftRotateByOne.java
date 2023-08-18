package data_structures.array;

public class LeftRotateByOne {
    public static void main(String[] args) {
        int[] input = {10, 20, 30, 40, 50};
        int[] result = leftRotateArrayByOne(input);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    private static int[] leftRotateArrayByOne(int[] array) {
        int temp = array[0];
        for (int i = 1; i < array.length; i++) {
            array[i - 1] = array[i];
        }
        array[array.length - 1] = temp;
        return array;
    }
}
