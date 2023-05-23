package algorithms.mathematics_problems;

public class CountPrimeFactorInNo {
    public static void printPrimes(int num) {
        boolean isPrime[] = new boolean[num + 1];
        for (int i = 0; i <= num; i++) {
            isPrime[i] = true;
        }
        for (int j = 2; j * j <= num; j++) {
            if (isPrime[j]) {
                System.out.print(j + " ");
                for (int k = j * j; k <= num; k = k + j) {
                    isPrime[k] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        printPrimes(10);
    }
}
