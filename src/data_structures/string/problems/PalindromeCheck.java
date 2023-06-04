package data_structures.string.problems;

public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println(checkIfPalindrome("ABCCBA"));//true
    }
    //O(n)
    public static boolean checkIfPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if ((str.charAt(start) != str.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}


