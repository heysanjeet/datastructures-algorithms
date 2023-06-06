package algorithms.searching.binary_search.problems;

public class SqareRoot {
    public static void main(String[] args) {
        System.out.println(findSqareRootOfN(25));//5
    }

    //Naive sol
    public static int findSqareRootOfN(int x) {
        int i = 1;
        while (i * i <= x) {
            i++;

        }
        return i - 1;
    }
}
