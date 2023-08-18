package data_structures.array;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int[] inputArray = {1, 0, 3, 0, 4, 0, 5, 0, 3, 0, 0, 2, 0, 2};
        int[] result = moveZeroToEnd(inputArray);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    //naive sol
    private static int[] moveToEnd(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {//search for zero
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] != 0) {//search for non-zero
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
        return array;
    }

    private static int[] moveZeroToEnd(int[] array) {
        int count = 0;//to know the index of zero
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {//found non zero value
                int temp = array[i];
                array[i] = array[count];
                array[count] = temp;
                count++;
            }
        }
        return array;
    }
}
