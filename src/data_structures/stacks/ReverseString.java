package data_structures.stacks;

import java.util.Stack;

public class ReverseString {

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
        String result = reverseString("Hello");
        System.out.println(result);
    }
}
