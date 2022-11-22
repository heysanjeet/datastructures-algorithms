package data_structures.arrays;

public class Array {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'd'};

        findValue(array);

    }

    //Method to take char[] as a input parameter and find the value from the array.
    public static void findValue(char[] array) {
        System.out.println(array[3]);
    }
}
