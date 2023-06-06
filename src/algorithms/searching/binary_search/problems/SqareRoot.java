package algorithms.searching.binary_search.problems;

public class SqareRoot {
    public static void main(String[] args) {
        System.out.println(findSqare(9));//3
    }

    //Naive sol
    public static int findSqareRootOfN(int x) {
        int i = 1;
        while (i * i <= x) {
            i++;

        }
        return i - 1;
    }

    public static int findSqare(int x) {
        int low = 0;
        int high = x;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int midSqrt = mid * mid;
            if (midSqrt == x) {
                return mid;
            }
            if (midSqrt < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
                result = mid;
            }
        }
        return result;
    }
}
