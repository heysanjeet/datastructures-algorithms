package data_structures.string.problems;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent"));//true
    }

    //naive solution O(nlogn)
    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] charArray1 = str1.toCharArray();
        Arrays.sort(charArray1);
        str1 = new String(charArray1);

        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray2);
        str2 = new String(charArray2);
        //System.out.println(str1+"   "+str2);

        return str1.equals(str2);
    }
}
