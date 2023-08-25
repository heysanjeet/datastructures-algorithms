package data_structures.string.problems;


import java.util.Stack;

// i/p- Welcome Sanjeet
//o/p-Sanjeet Welcome
public class ReverseWordInString {
    public static void main(String[] args) {
        String str = "Welcome to Sanjeet";
        //System.out.println(reverseWordInString(str));

        char[] chars = str.toCharArray();
        reverseWords(chars, str.length());
        System.out.println(chars);

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


    public static void reverse(char str[], int low, int high) {
        while (low <= high) {
            //swap
            char temp = str[low];
            str[low] = str[high];
            str[high] = temp;
            //
            low++;
            high--;
        }
    }

    //O(1)
    public static void reverseWords(char str[], int n) {
        int start = 0;
        for (int end = 0; end < n; end++) {
            if (str[end] == ' ') {
                reverse(str, start, end - 1);
                start = end + 1;
            }
        }
        reverse(str, start, n - 1);
        reverse(str, 0, n - 1);
    }
}
