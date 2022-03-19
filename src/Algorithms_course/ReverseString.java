package Algorithms_course;

import java.util.Arrays;
import java.util.Stack;

public class ReverseString {

    public static void main(String[] args) {
//        System.out.println(doReverseString("egypt"));
//        System.out.println(doReverseStringV2("egypt"));
        System.out.println(doReverseStringV3("egypt"));
        System.out.println(doReverseStringV4("egypt is the most famous country in the world"));
    }

    private static String doReverseStringV4(String value) {
        Stack<Character> stack = new Stack<>();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < value.length(); i++) {
            stack.push(value.charAt(i));
        }
       while (!stack.empty()){
           builder.append(stack.pop());
       }
        return builder.toString();
    }

    private static String doReverseStringV3(String value) {
        // using recursion
        if(value == null || value.length()== 0)
            return value;
        return doReverseStringV3(value.substring(1))+ value.charAt(0);
    }

    private static String doReverseStringV2(String value) {
        StringBuilder builder = new StringBuilder();
        String [] splitter = value.split("");
        for (int i = splitter.length-1; i >= 0; i--) {
            builder.append(splitter[i]);
        }
        return builder.toString();
    }

    private static String doReverseString(String value) {

        StringBuilder builder = new StringBuilder();
        String [] splitter = value.split("");
        int forwardPosition = 0;
        int backWordPosition = splitter.length-1;
        for (int i = splitter.length-1; i >= 0; i--) {
            if(forwardPosition < backWordPosition){
                String temp = splitter[forwardPosition];
                splitter[forwardPosition] = splitter[i];
                splitter[i] = temp;
                forwardPosition++;
                backWordPosition--;
            }
        }

        Arrays.stream(splitter).forEach(s -> {
            builder.append(s);
        });

        return builder.toString();
    }
}
