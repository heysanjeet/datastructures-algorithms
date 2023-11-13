package algorithms.searching.binary_search.problems;

public class SearchElementInInfiniteSizeArray {
    public static void main(String[] args) {
        //sorted array

        int[] array = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.println(searchEfficient(array, 10));//5
    }

    //Naive sol
    //time 0(pos)
    public static int search(int[] array, int target) {
        int i = 0;
        while (true) {
            if (array[i] == target) {
                return i;
            }
            if (array[i] > target) {
                return -1;
            }
            i++;
        }
    }
    //efficient approach

    public static int searchEfficient(int[] array, int target) {
        if (array[0] == target) {
            return 0;
        }
        int i = 1;
        while (array[i] < target) {
            i = i * 2;
        }
        if (array[i] == target) {
            return i;
        }
        return findElementInInfiniteSizeArray(array, i / 2 + 1, i - 1, target);
    }


    //this is not efficient approach because we don't know the array size
    public static int findElementInInfiniteSizeArray(int[] array, int start, int end, int element) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (array[mid] == element) {
            return mid;
        }
        if (element > array[mid]) {
            return findElementInInfiniteSizeArray(array, mid + 1, end, element);
        } else if (element < array[mid]) {
            return findElementInInfiniteSizeArray(array, start, mid - 1, element);
        }
        return -1;
    }

}
