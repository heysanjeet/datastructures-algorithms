package algorithms.searching.binary_search.problems;

public class FindLastOccurance {
    //recursive approach
    public static int findLastOccurance(int[] array, int low, int high, int target, int length) {
        int mid = (low + high) / 2;
        if (low > high) {
            return -1;
        }
        if (array[mid] > target) {
            return findLastOccurance(array, low, mid - 1, target, length);
        } else if (array[mid] < target) {
            return findLastOccurance(array, mid + 1, high, target, length);
        } else {
            if (mid == length || array[mid + 1] != array[mid]) {
                return mid;
            }
            return findLastOccurance(array, mid + 1, high, target, length);
        }
    }

    public static int findLastOccuranceIterative(int[] array, int target) {
        int low = 0;
        int high = array.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] > target) {
                high = mid - 1;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                if (mid == array.length - 1 || array[mid] != array[mid + 1]) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 30, 40, 40, 50, 50};
        System.out.println(findLastOccurance(array, 0, array.length - 1, 30, array.length - 1));//5
        System.out.println(findLastOccuranceIterative(array, 30));//5
    }
}
