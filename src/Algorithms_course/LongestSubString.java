package Algorithms_course;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

    public static void main(String[] args) {
        // get the longest substring without repetitions like 'abcdab'
        // the output will be (abcd) - (ab) so the longest will be 'abcd'
        String input = "abcdabdefg";
//        String input = "ABDEFGABEF";
//        System.out.println(getLongest(input));
        System.out.println("V2 : " + getLongestV2(input));
    }

    private static String getLongestV2(String input) {
        int length = input.length();
        int longest = 0;
        String longestStr = null;
        for (int i = 0; i <length ; i++) {
            char ch = input.charAt(i);
            String sub = input.substring(input.indexOf(ch) ,  input.lastIndexOf(ch));
            if(sub.length() > longest){
                longest = sub.length();
                longestStr = sub;
            }

        }
        return longestStr;
    }

    private static String getLongest(String input) {
        // Time is O(n) space O(n)
        Set<Character> characterSet = new HashSet<>();
        StringBuilder current = new StringBuilder("");
        String longest = "";
        for (int i = 0; i < input.length(); i++) {
             char ch = input.charAt(i);
             if(!characterSet.contains(ch)){
                 characterSet.add(ch);
                 current.append(ch);
                 if(current.length() > longest.length())
                     longest = current.toString();
             }else{
                current = new StringBuilder("");
                characterSet.clear();
             }
        }
        return longest;
    }
}
