package data_structures.array;

public class Array {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'd'};
        //findValue(array);
        int[] intArray = {5, 4, 7, 3, 6, 4, 5, 2, 2, 7, 3, 9, 4, 7, 4};
        System.out.println(countValue(intArray, 5));//2

    }

    //Method to take char[] as a input parameter and find the value from the array.
    public static void findValue(char[] array) {
        System.out.println(array[3]);
    }

    public static int searchValue(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int countValue(int[] array, int target) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                count++;
            }
        }
        return count;
    }
}
