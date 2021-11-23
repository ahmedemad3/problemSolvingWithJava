package Algorithms_course;

import java.util.Locale;

public class VowelsLetters {

    public static void main(String[] args) {
        
        String input = "Hello world";
        System.out.println(countVowelsLetters(input));
    }

    private static int countVowelsLetters(String input) {
        int count = 0;
        input = input.toLowerCase(Locale.ROOT);
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if(ch== 'a' || ch== 'e' || ch== 'i' || ch== 'o' || ch== 'u'){
                count++;
            }
        }

        return count;
    }
}
