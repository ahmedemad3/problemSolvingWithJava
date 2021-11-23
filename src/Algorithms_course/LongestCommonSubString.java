package Algorithms_course;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestCommonSubString {

    public static void main(String[] args) {
        String s1 = "ABAB";
        String s2 = "BABA";
        System.out.println(getLongestCommonSubString(s1 , s2));
    }

    private static String getLongestCommonSubString(String s1, String s2) {
        int length = s1.length();
        // get possible subStrings
        Set<String> set = getPossibleSubStrings(length , s1);

        // check if s2 contains and compare length
        String longest = "";
        for (String value: set) {
            if(s2.contains(value)){
                if(value.length() > longest.length())
                    longest = value;
            }
        }
        return longest;
    }

    private static Set<String> getPossibleSubStrings(int length, String s1) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < length; i++) {
            for (int j = i+1; j <= length; j++) {
                set.add(s1.substring(i,j));
            }
        }
        return set;
    }
}
