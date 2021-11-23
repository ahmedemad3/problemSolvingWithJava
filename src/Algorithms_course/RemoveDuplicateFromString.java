package Algorithms_course;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromString {

    public static void main(String[] args) {

        removeDuplicates("HelloWorld"); // sandep
    }

    private static String removeDuplicates(String input) {

        Set<Character> set = new HashSet<>();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch= input.charAt(i);
            if(set.add(ch)){
                // not added before
                builder.append(ch);
            }
        }

        System.out.println(builder.toString());
        return builder.toString();
    }


}
