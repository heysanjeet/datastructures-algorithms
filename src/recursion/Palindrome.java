package recursion;

public class Palindrome {
    public static boolean isPlalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        return (str.charAt(start) == str.charAt(end) && isPlalindrome(str, start + 1, end - 1));
    }

    public static void main(String[] args) {
        String str="aacaa";
        System.out.println(isPlalindrome(str,0,str.length()-1));//true
    }
}
