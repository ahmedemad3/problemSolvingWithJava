package Talabat;

import java.util.HashSet;
import java.util.Set;

public class Demo2 {

    public static void main(String[] args) {

        // Palindorm madam revers madam ==> True
//        String input = "madam";
//        System.out.println( "isPalindorm  : " + isPalindorm(input));
//
//
//        System.out.println( "isPalindorm v2  : " + isPalindormV2(input));

        int number = 7;
        System.out.println(isAwesomeNumber(number));

    }

    /**
     * is isAwesome Number 1 + 2 + 3 + 4
     * @param number
     * @returns
     */
    private static boolean isAwesomeNumber(int number) {

        int sum = 0;
        int position = 0;
        for (int i = position; i <= number; i++) {
            sum = sum + i;
            if(sum == number){
                return true;
            } else if(sum > number){
                sum = 0;
                position--;
            }
        }
        return false;
    }

    private static boolean isPalindormV2(String input) {

        int length = input.length();
        if(input.charAt(0) != input.charAt(length-1))
            return false;
        for (int i = 0; i < length; i++) {
            if(input.charAt(i) != input.charAt(length-1-i))
                return false;
        }

        return true;
    }

    /**
     * check is String is Palindorm
     * @param input
     */
    private static boolean isPalindorm(String input) {

        // time O(N)
        int length = input.length();
        String reverseString = reverseString(input , length);

        for (int i = 0; i < length; i++) {
            if(input.charAt(i) != reverseString.charAt(i))
                return false;
        }

        return true;
    }

    private static String reverseString(String input, int length) {
        StringBuffer reversStr = new StringBuffer();
        for (int i = length-1; i >=0 ; i--) {
            reversStr.append(input.charAt(i));
        }
        return reversStr.toString();
    }
}
