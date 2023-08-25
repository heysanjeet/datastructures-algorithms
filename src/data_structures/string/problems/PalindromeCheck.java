package data_structures.string.problems;

public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println(isPalindromeNaive("ABCCBA"));//true
    }
    //O(n)
    //Read the string from left to right and right to left it is same
    public static boolean checkIfPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if ((str.charAt(start) != str.charAt(end))) {//if the characters are not same the false
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    //Normal approach
    public static boolean isPalindromeNaive(String str){
        StringBuilder reverse=new StringBuilder(str);
        reverse.reverse();
        return str.equals(reverse.toString());

    }
}


