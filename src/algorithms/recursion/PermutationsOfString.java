package algorithms.recursion;

public class PermutationsOfString {
    public static void main(String[] args) {
        String str = "ABC";
        int n = str.length();
        printPermutation(str, 0);
    }

    public static void printPermutation(String str, int i) {
        if (i == str.length() - 1) {
            System.out.println(str);
        } else {
            for (int j = i; j <= str.length() - 1; j++) {
                str = swap(str, i, j);
                printPermutation(str, i + 1);
                str = swap(str, i, j);
            }
        }
    }

    private static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
