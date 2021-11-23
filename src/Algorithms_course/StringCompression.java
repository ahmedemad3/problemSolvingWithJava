package Algorithms_course;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringCompression {


    /**
     * Given an example of string "aabbbcc" write a program to compress it like that "a3b2c2"
     * @param args
     */

    public static void main(String[] args) {
        String input = "aabbbbccddd";
        System.out.println(compressAndPrint(input));
        System.out.println(compressAndPrintV2(input));
    }

    private static String compressAndPrintV2(String input) {
        String result = "";
        int sum = 1;
        int length = input.length();
        for (int i = 0; i < length; i++) {
            if(i+1 < length && input.charAt(i) == input.charAt(i+1))
                sum++;
            else {
                result = result + input.charAt(i) + sum;
                sum = 1;
            }
        }

        return result;
    }

    private static String compressAndPrint(String input) {
        
        Map<Character , Integer> map = new HashMap<>();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
           char ch = input.charAt(i);
           if(map.containsKey(ch)){
                map.put(ch , (map.get(ch)+1));
           }else{
               map.put(ch , 1);
           }
        }

       map.forEach((character, integer) -> {
           builder.append(character).append(integer);
       });

        return builder.toString();
    }

}
