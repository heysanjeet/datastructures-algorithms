package algorithms.mathematics_problems;

public class CountDigit {
    public static int count(int number) {
        int counter = 0;
        while (number > 0) {
            number = number / 10;//remove last digit and avoid the reminder.
            counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(count(2345));
    }
}
