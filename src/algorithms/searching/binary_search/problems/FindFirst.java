package algorithms.searching.binary_search.problems;

public class FindFirst {
    public static void main(String[] args) {
        int[] array={0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        System.out.println(findFirst(array,array.length));//14
    }

    public static int findFirst(int[] array, int length) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == 0) {
                low = mid + 1;
            } else {
                if (mid == 0 || array[mid - 1] != array[mid]) {
                    return (length - mid);
                } else {
                    high = mid - 1;
                }
            }
        }
        return 0;
    }
}
