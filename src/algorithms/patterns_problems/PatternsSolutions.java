package algorithms.patterns_problems;

public class PatternsSolutions {
    public static void main(String[] args) {
        pattern1(4);
    }

    /*
     ****
     ***
     **
     *
     */
    private static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n + 1 - row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
     ****
     ****
     ****
     ****
     */
    private static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
