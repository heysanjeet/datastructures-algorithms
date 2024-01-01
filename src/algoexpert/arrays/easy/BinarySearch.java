package algoexpert.arrays.easy;

import java.util.Arrays;

public class BinarySearch {

    /*input={0,1,21,33,45,61,71,72}
    target=33
    output=3*/
    public static void main(String[] args) {
        int[] array = {24, 0, 1, 21, 33, 45, 61, 71, 72};
        System.out.println(binarySearch1(array, 33));//3
    }


    //if the array is sorted
    //tc- O(logn) | space= O(1)
    public static int binarySearch2(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;
            if (array[mid] == target) {
                return mid;
            }
            if (array[mid] < target) {
                start = mid + 1;
            }
            if (array[mid] > target) {
                end = mid - 1;
            }
        }
        return -1;
    }

    //if the array is not sorted.
    //tc=n(logn) | space=O(1)
    public static int binarySearch1(int[] array, int target) {
        Arrays.sort(array);
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;
            if (array[mid] == target) {
                return mid;
            }
            if (array[mid] < target) {
                start = mid + 1;
            }
            if (array[mid] > target) {
                end = mid - 1;
            }
        }
        return -1;
    }
}
