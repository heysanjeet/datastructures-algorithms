package data_structures.string.problems;

public class SubsequenceString {
    public static void main(String[] args) {
        System.out.println(checkIfStringSubsequence("ABCD", "AD", 3, 1));
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


}
