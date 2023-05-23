package algorithms.mathematics_problems;

public class GretestCommonDovision {

    public static int findGCD(int num1,int num2) {
        int res = Math.min(num1, num2);
        while (res > 0) {
            if (num1 % res == 0 && num2 % res == 0) {
                break;
            }
            res--;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(findGCD(150,200));
    }
}
