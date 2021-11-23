package Algorithms_course;

public class StringPalindrome {

    public static void main(String[] args) {
        String input = "mom";
        isStringPalindrome(input);
    }

    private static void isStringPalindrome(String input) {

        String reverseStr = reverseString(input);
//        System.out.println("reverseStr : " + reverseStr);
        if(input.equalsIgnoreCase(reverseStr)){
            System.out.println("String is Palindrome");
        }else {
            System.out.println("String is not Palindrome");
        }
    }

    private static String reverseString(String input) {
        StringBuffer buffer = new StringBuffer();
        for (int i = input.length()-1; i >= 0; i--) {
            buffer.append(input.charAt(i));
        }
        return buffer.toString();
    }
}
