package algorithms.recursion;

public class Fibonacci {

    public static int findFabonaccu(int n){
        if(n<=1){
            return n;
        }

        return findFabonaccu(n-1)+findFabonaccu(n-2);
    }

    public static void main(String[] args) {
        System.out.println(findFabonaccu(10));
    }
}
