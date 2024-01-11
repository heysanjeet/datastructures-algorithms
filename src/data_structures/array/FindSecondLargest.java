package data_structures.array;

public class FindSecondLargest {
    public static void main(String[] args) {
        int[] array = {25, 64, 9, 9, 8, 53, 4, 231};
        System.out.println(findSecondLargest(array));//1
    }

    public static int getLargest(int[] array) {
        int res = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[res] < array[i]) {
                res = i;
            }
        }
        return res;
    }

    //O(n)
    public static int findSecondLargestNaive(int[] array) {
        int largest = getLargest(array);
        int res = -1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[largest]) {//ignore is equal to largest
                if (res == -1) {
                    res = i;
                } else if (array[res] < array[i]) {
                    res = i;
                }
            }
        }
        return res;
    }

    //O(n)
    public static int findSecondLargest(int[] array) {
        int res = -1;
        int largest = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[largest]) {
                res = largest;//keep track of the largest element
                largest = i;
            } else if (array[i] != array[res]) {
                if (res == -1 || array[i] > array[res]) {
                    res = i;
                }
            }
        }
        return res;
    }
}
