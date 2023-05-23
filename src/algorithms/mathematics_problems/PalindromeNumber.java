package algorithms.mathematics_problems;

public class PalindromeNumber {
    public static boolean isPalindrome(int number) {
        int rev = 0;
        int temp=number;
        while (temp != 0) {
            int reminder = temp % 10;
            rev = rev * 10 + reminder;
            temp = temp / 10;
        }
        return (rev==number);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
