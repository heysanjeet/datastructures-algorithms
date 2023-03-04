package dynemic_programming;

public class Factorial {

    public static int findFacotrial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * findFacotrial(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(findFacotrial(5));
    }
}
