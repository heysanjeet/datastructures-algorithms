package sample_problems;

public class FindFactorial {

    public static int findFactorial(int nums) {
        int fact = 1;
        for (int i = 2; i <= nums; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int recursiveApproachForFactorial(int num) {
        if (num == 0) {
            return 1;
        }
        return (num * recursiveApproachForFactorial(num - 1));
    }

    public static void main(String[] args) {
        System.out.println(recursiveApproachForFactorial(4));
    }
}
