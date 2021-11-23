package Algorithms_course;

import java.util.Stack;

public class ParanthesisChecker {

    /**
     * input like that {([])}
     * @param args
     */

    public static void main(String[] args) {
        String input = "{([)}";
        checker(input);
    }

    private static void checker(String input) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if(stack.isEmpty())
                stack.push(ch);
            else if(ch== '{' || ch=='(' || ch=='[')
                stack.push(ch);
            else if(ch=='}' && stack.peek() == '{')
                stack.pop();
            else if(ch==')' && stack.peek() == '(')
                stack.pop();
            else if(ch==']' && stack.peek() == '[')
                stack.pop();
        }

        if(stack.isEmpty())
            System.out.println("the string is well formed");
        else
            System.out.println("the string is not well formed");

    }
}
