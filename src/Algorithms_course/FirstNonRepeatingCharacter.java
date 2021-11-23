package Algorithms_course;

import com.sun.org.apache.xpath.internal.operations.Bool;
import sun.text.normalizer.UCharacter;

import javax.swing.text.StyledEditorKit;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstNonRepeatingCharacter {

    /**
     * first non-repeating character like 'aaabbcdd'
     * @param args
     */
    public static void main(String[] args) {

//        String input = "aabffccdd";
//        System.out.println(getFirstNonRepeatingCharacter(input));

//        String input = "aabccdsds";
//        System.out.println(getFirstNonRepeatingCharacterV2(input));

        String input = "aabccdsds";
        System.out.println(getFirstNonRepeatingCharacterV3(input));
    }

    private static Character getFirstNonRepeatingCharacterV3(String input) {
        int length = input.length();
        for (int i = 0; i < length; i++) {
            if(input.indexOf(input.charAt(i)) == input.lastIndexOf(input.charAt(i))){
                return input.charAt(i);
            }
        }
        return '_';
    }

    private static Character getFirstNonRepeatingCharacterV2(String input) {
        Map<Character , Integer> map = new HashMap<>();
        int length = input.length();
        for (int i = 0; i < length; i++) {
            char ch = input.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch , map.get(ch) + 1);
            }else{
                map.put(ch , 1);
            }
        }

        for (int i = 0; i < length; i++) {
            if(map.get(input.charAt(i)) == 1){
                return input.charAt(i);
            }
        }
        return '_';
    }

    private static Character getFirstNonRepeatingCharacter(String input) {
       int length = input.length();
        for (int i = 0; i < length; i++) {
            char currentChar = input.charAt(i);
            boolean nonRepeat = checkBeforeAndAfter(i , length , input , currentChar);
            if (nonRepeat)
                return currentChar;
        }
        return '0';
    }

    private static boolean checkBeforeAndAfter(int currentIndex, int length, String input, char currentChar) {
        char nextChar = '*';
        char previousChar = '*';
       if(currentIndex == 0){
           nextChar = (currentIndex < length-1) ? input.charAt(currentIndex + 1) : '*';
           if(nextChar == currentChar)
               return false;
           else
               return true;
       }else if(currentIndex > 0 && (currentIndex < length-1)){
           previousChar = input.charAt(currentIndex - 1);
           nextChar = input.charAt(currentIndex + 1);
           if(currentChar != previousChar && currentChar != nextChar)
               return true;
           else
               return false;
       } else if (currentIndex > 0 && (currentIndex == length-1)){
           previousChar = input.charAt(currentIndex - 1);
           if(currentChar != previousChar)
               return true;
           else
               return false;
       }
        return false;
    }
}
