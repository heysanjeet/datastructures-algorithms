package data_structures.string.problems;


import java.util.Stack;

// i/p- Welcome Sanjeet
//o/p-Sanjeet Welcome
public class ReverseWordInString {
    public static void main(String[] args) {
        System.out.println(reverseWordInString("Welcome to Sanjeet"));
    }


    //Naive sol
    public static String reverseWordInString(String str) {
        String rev = "";
        Stack<String> strStrack = new Stack<>();
        String[] startArray = str.split(" ");
        for (int i = 0; i < startArray.length; i++) {
            strStrack.push(startArray[i]);
        }
        while (!strStrack.empty()) {
            rev = rev + " " + strStrack.pop();
        }
        return rev;
    }

    //O(1)
   /* public static void reverseWord(String str) {
        int start = 0;
        for (int end = 0; end < str.length(); end++) {
            if (str.charAt(end) == ' ') {
                reverse(str, start, end - 1);
                start = end++;
            }
        }
        reverse(str, start, str.length() - 1);
        reverse(str, 0, str.length() - 1);
    }

    private static void reverse(String str, int start, int end) {
        while (start <= end) {
            int tem = start;
            start = end;
            end = tem;
            start++;
            end--;
        }
    }*/
}
