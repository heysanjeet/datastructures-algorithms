package data_structures.array;

public class FrequencyInSortedArray {

    /* Input: arr[] = {1, 1, 1, 2, 3, 3, 5, 5, 8, 8, 8, 9, 9, 10}
     Output:       Frequency of 1 is: 3
     Frequency of 2 is: 1
     Frequency of 3 is: 2
     Frequency of 5 is: 2
     Frequency of 8 is: 3
     Frequency of 9 is: 2
     Frequency of 10 is: 1*/
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 2, 3, 3, 5, 5, 8, 8, 8, 9, 9, 10};
        printFrequency(arr);
    }

    //time- O(n)
    //space- O(1)
    public static void printFrequency(int[] array) {
        int count = 1;
        int i = 1;
        while (i < array.length) {
            while (i < array.length && array[i] == array[i - 1]) {
                count++;
                i++;
            }
            System.out.println(array[i - 1] + " -> " + count);
            i++;
            count = 1;
        }
        if (array.length == 1 || array[array.length - 1] != array[array.length - 2]) {
            System.out.println(array[array.length - 1] + "-> " + 1);
        }
    }
}
