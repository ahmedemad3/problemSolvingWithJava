package Algorithms_course;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class NumberOfOccurenceCharacter {

    public static void main(String[] args) {

        String input = "Hello World";

        System.out.println(getNumberOfOccurenceCharacter(input , 'l'));

        System.out.println(getNumberOfOccurenceCharacter2(input , "l"));
    }

    private static int getNumberOfOccurenceCharacter2(String input, String character) {
        int actualLength = input.length();
        String modifiedInput= input.replaceAll(character , "");
        int modifiedLength = modifiedInput.length();
        return actualLength - modifiedLength;
    }

    private static int getNumberOfOccurenceCharacter(String input, Character character) {

        int result = 0;
        // first solution to iterate and count
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == character)
                result ++;
        }
        return result;
    }


}
