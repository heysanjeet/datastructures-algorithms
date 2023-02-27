package data_structures.stacks.problems;


import java.util.ArrayDeque;
import java.util.Stack;

public class BalancedParenthesis {

    public static boolean isBalancedParenthesis(String value) {

        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < value.length(); i++) {
            char chars = value.charAt(i);
            if (chars == '(' || chars == '{' || chars == '[') {
                stack.push(chars);
            } else {
                if (stack.isEmpty() == true) {//it string contains just '}'
                    return false;
                } else if (matching(stack.peek(), chars) == false) {//if not matching return false
                    return false;
                } else {
                    stack.pop();//if matching pop the element
                }
            }
        }
        return (stack.isEmpty() == true);
    }

    public static boolean matching(char a, char b) {
        return ((a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']'));
    }

    public static void main(String[] args) {
        System.out.println(isBalancedParenthesis("{[]}"));
    }
}
