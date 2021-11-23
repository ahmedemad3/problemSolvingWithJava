package Algorithms_course;

import java.util.Arrays;
import java.util.Collections;

public class SortCharactersInString {
    
    public static void main(String[] args) {
        String input = "hello";
        sortCharactersInString(input);
    }

    private static void sortCharactersInString(String input) {
        char[] arr = input.toCharArray();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


}
