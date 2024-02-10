package leetcode.feb;

public class PalindromicSubstrings {
    int count = 0;

    public static void main(String[] args) {
        /*Input: s = "abc"
        Output: 3
        Explanation: Three palindromic strings: "a", "b", "c".*/
    }

    public int countSubstrings(String s) {
        if (s == null || s.length() == 0) return 0;
        for (int i = 0; i < s.length(); i++) {
            checkPalindrome(s, i, i);
            checkPalindrome(s, i, i + 1);
        }
        return count;
    }

    private void checkPalindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
    }
}
