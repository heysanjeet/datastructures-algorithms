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
            rev = rev+" " + strStrack.pop();
        }
        return rev;
    }

}
