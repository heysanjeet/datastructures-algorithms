package algorithms.mathematics_problems;

public class FibnanciiSeries {
    public static void main(String[] args) {
        fibnanciSeries(10);
    }

    private static void fibnanciSeries(int num) {
        int n1 = 0;
        int n2 = 1;
        System.out.print(n1 + " " + n2 + " ");
        for (int i = 2; i < num; i++) {
            int n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }

    }
}
