package algorithms.patterns_problems;

public class PatternsSolutions {
    public static void main(String[] args) {
        pattern4(5);
    }

    /**
     12345
     1234
     123
     12
     1
     */
    private static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n + 1 - row; col++) {
                System.out.print(col + "");
            }
            System.out.println();
        }
    }

    /**
     1
     1 2
     1 2 3
     1 2 3 4
     1 2 3 4 5
     */
    private static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
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
