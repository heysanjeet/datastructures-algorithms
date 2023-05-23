package data_structures.array;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseStringInJava("ramuK teejnaS"));
    }

    //Native approach
    public static void reverseString(String str) {
        char[] strArray = str.toCharArray();
        for (int i = strArray.length - 1; i >= 0; i--) {
            System.out.print(strArray[i]);
        }
    }

    public static void reverseString2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);
    }

    public static String reverseStringInJava(String str) {
        return new StringBuilder(str).reverse().toString();
    }

}
