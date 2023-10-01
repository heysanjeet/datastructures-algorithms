package algorithms.recursion;

public class TowarOfHanoi {
    public static void main(String[] args) {
        toh(3, 'A', 'B', 'C');
    }

    public static void toh(int n, char A, char B, char C) {
        if (n == 1) {
            System.out.println("Move 1 from " + A + " to " + C);
            return;
        }
        toh(n - 1, A, C, B);
        System.out.println("Move " + n + " From " + A + " to " + C);
        toh(n - 1, B, A, C);
    }
}
