package dynemic_programming;

public class NaturalNo {
    public static int findSumOfNaturalNo(int n) {
        if (n == 0) {
            return 0;
        }
        return n + findSumOfNaturalNo(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(findSumOfNaturalNo(4));
    }
}
