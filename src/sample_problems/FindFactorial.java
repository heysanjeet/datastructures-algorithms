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
    //it is not efficient solution, there stackoverflow issue
    public static int countZeroFromFactorial(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact = fact * i;
        }
        int countZero = 0;
        while (fact % 10 == 0) {
            countZero++;
            fact = fact / 10;
        }
        return countZero;
    }

    public static int countZeroFromFactorialEfficient(int num) {
        int result = 0;
        for (int i = 5; i <= num; i = i * 5) {
            result = result + num / i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countZeroFromFactorialEfficient(251));
    }
}
