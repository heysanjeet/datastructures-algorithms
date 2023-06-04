package data_structures.string.problems;

public class SubsequenceString {
    public static void main(String[] args) {
        //System.out.println(checkIfStringSubsequence("ABCD", "AD", 3, 1));
        System.out.println(checkIfStringSubsequenceRecursion("ABCD", "AD", 3, 1));
    }

    //iterative way
    public static boolean checkIfStringSubsequence(String str1, String str2, int n, int m) {
        if (n < m) {
            return false;
        }
        int j = 0;
        for (int i = 0; i < n && j < m; i++) {
            if (str1.charAt(i) == str2.charAt(j)) {
                j++;
            }
        }
        return (j == m);
    }

    public static boolean checkIfStringSubsequenceRecursion(String str1, String str2, int n, int m) {
        if (m == 0) {
            return true;
        }
        if (n == 0) {
            return false;
        }
        if (str1.charAt(n - 1) == str2.charAt(m - 1)) {
            return checkIfStringSubsequenceRecursion(str1, str2, n - 1, m - 1);
        } else {
            return checkIfStringSubsequenceRecursion(str1, str2, n - 1, m);
        }
    }


}
