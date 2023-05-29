package algorithms.searching.binary_search.problems;

public class CountOccurrence {
    public static void main(String[] args) {
        int[] array = {1,1, 2, 2, 2, 2, 5, 6, 9, 9};
        System.out.println(countOccurrence(array, 0, array.length - 1, 1));
    }

    public static int countOccurrence(int[] array, int low, int high, int target) {
        int firstOccurance = findIndexOfFirstOccuranceRecursive(array, low, high, target);
        if (firstOccurance == -1) {
            return 0;
        } else {
            return findLastOccurance(array, 0, array.length, target, array.length) - firstOccurance + 1;
        }

    }

    public static int findIndexOfFirstOccuranceRecursive(int[] array, int low, int high, int target) {
        int mid = (low + high) / 2;
        if (low > high) {
            return -1;
        }
        if (array[mid] > target) {
            return findIndexOfFirstOccuranceRecursive(array, low, mid - 1, target);
        } else if (array[mid] < target) {
            return findIndexOfFirstOccuranceRecursive(array, mid + 1, high, target);
        } else {
            //if mid==0 then it is first occurrence
            //if array[mid - 1] != array[mid] then also it is first occurrence
            if (mid == 0 || array[mid - 1] != array[mid]) {
                return mid;
            }
            //this is mid occurrence and we are looking for first occurrence so we have go in left half
            return findIndexOfFirstOccuranceRecursive(array, low, mid - 1, target);
        }
    }

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
}