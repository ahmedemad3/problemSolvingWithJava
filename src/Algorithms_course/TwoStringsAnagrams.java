package Algorithms_course;

import java.util.Arrays;
import java.util.Collections;

public class TwoStringsAnagrams {

    public static void main(String[] args) {
        String input1= "abb";
        String input2= "bba";
//        System.out.println("is Equal : " + isTwoStringsAnagrams(input1 ,input2 ));
        System.out.println("is Equal : " + isTwoStringsAnagramsV2(input1 ,input2 ));
    }

    private static boolean isTwoStringsAnagramsV2(String input1, String input2) {

        int length = input1.length();
        if(input1.length() != input2.length()) return false;
        else {
            for (int i = 0; i < length; i++) {
                if(input1.charAt(i) != input2.charAt(length-1 - i))
                    return false;
            }
        }
        return true;
    }

    private static boolean isTwoStringsAnagrams(String input1, String input2) {
        String [] splitterInput1= input1.split("");
        Arrays.sort(splitterInput1 , Collections.reverseOrder());

        String [] splitterInput2= input2.split("");
        Arrays.sort(splitterInput2 , Collections.reverseOrder());

       boolean isEqual = Arrays.equals(splitterInput1 , splitterInput2);


        return isEqual;
    }
}
