package algorithms.searching.binary_search.problems;

public class IndexOfFirstOccurance {
    //recursive approach
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

    public static int iterativeApproach(int[] array, int target) {
        int low = 0;
        int high = array.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] > target) {
                high = mid - 1;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                //if mid==0 then it is first occurrence
                //if array[mid - 1] != array[mid] then also it is first occurrence
                if (mid == 0 || array[mid - 1] != array[mid]) {
                    return mid;
                } else {
                    //this is mid occurrence and we are looking for first occurrence so we have go in left half
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 30, 40, 40, 50};
        //System.out.println(findIndexOfFirstOccuranceRecursive(array, 0, array.length, 40));
        System.out.println(iterativeApproach(array, 40));//2
    }
}