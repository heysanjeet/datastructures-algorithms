package algorithms.searching.binary_search;

public class BinarySearchIterative {
    //we can implement binary search is the array is sorted.
    public static int searchElement(int array[], int target) {
        int low = 0;
        int high = array.length-1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60};
        System.out.println(searchElement(array, 60));//1
    }
}
