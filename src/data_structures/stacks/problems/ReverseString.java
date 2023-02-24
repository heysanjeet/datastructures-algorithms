package data_structures.stacks.problems;

import java.util.Stack;

public class ReverseString {

    public static String reverse(String str) {
        char[] charArray = str.toCharArray();
        int size = str.length();
        Stack<Character> stack = new Stack<>();
        int i;
        for (i = 0; i < size; i++) {
            stack.push(charArray[i]);
        }
        for (i = 0; i < size; i++) {
            charArray[i] = stack.pop();
        }
        return String.valueOf(charArray);
    }

    public static String reverseString(String str) {
        String result = "";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        while (!stack.empty()) {
            result = result + stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        String result = reverse("Hello");
        System.out.println(result);
    }
}
