package leetcode.feb;

public class FindFirstPalindromicStringintheArray {
    public static void main(String[] args) {
       /* Input: words = ["abc","car","ada","racecar","cool"]
        Output: "ada"
        Explanation: The first string that is palindromic is "ada".
                Note that "racecar" is also palindromic, but it is not the first.*/
    }

    public String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindrome(word)) {
                return word;
            }
        }
        return "";
    }

    private boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start <= end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public String firstPalindromeNaive(String[] words) {
        for (String word : words) {
            String rev = new StringBuilder(word).reverse().toString();
            if (word.equals(rev)) {
                return word;
            }
        }
        return "";
    }
}
