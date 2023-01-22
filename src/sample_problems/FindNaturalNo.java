package sample_problems;

public class FindNaturalNo {

    //0(1)
    public static int findSumOfFirstNaturalNo(int number) {
        return number * (number + 1) / 2;
    }

    //0(n)
    public static int findSumOfNaturalNo2(int number) {
        int sumOfNo = 0;
        for (int i = 0; i <= number; i++) {
            sumOfNo = sumOfNo + i;
        }
        return sumOfNo;
    }

    //0(n2)
    public static int findNaturalNoSum(int number) {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(findNaturalNoSum(5));
    }
}
