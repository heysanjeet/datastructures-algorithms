package recursion;

public class Factorial {

    public static int findFacotrial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * findFacotrial(n - 1);
        }
    }

    public static int findFacotrialTailRecurseion(int n,int k) {
        if (n == 0) {
            return k;
        } else {
            return findFacotrialTailRecurseion(n - 1, k*n);
        }
    }

    public static void main(String[] args) {
        System.out.println(findFacotrialTailRecurseion(5,1));
    }
}
