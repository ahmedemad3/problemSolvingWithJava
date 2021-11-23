package Algorithms_course;

import java.util.HashMap;
import java.util.Map;

public class SortWordsInStringAccordingToLength {

    public static void main(String[] args) {

        String input = "I love my Country";

//        doSortWordsInStringAccordingToLength(input);
        doSortWordsInStringAccordingToLengthV2(input);
    }

    private static void doSortWordsInStringAccordingToLengthV2(String input) {

        String [] splitter = input.split(" ");
        Map<String , Integer> map = new HashMap<>();
        for (int i = 0; i < splitter.length; i++) {
            map.put(splitter[i], splitter[i].length());
        }

        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(stringIntegerEntry -> {
            System.out.println(stringIntegerEntry.getKey());
        });
    }

    private static void doSortWordsInStringAccordingToLength(String input) {

        String [] splitter = input.split(" ");
        for (int i = 0; i < splitter.length; i++) {
            for (int j = i+1; j < splitter.length; j++) {
                if(splitter[i].length() > splitter[j].length()){
                    String temp = splitter[i];
                    splitter[i] = splitter[j];
                    splitter[j] = temp;
                }
            }
        }

        for (String str : splitter) {
            System.out.println(str);
        }
    }

}
