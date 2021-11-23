package Algorithms_course;

import java.util.*;
import java.util.stream.Stream;

public class PrintCharactersInDescendingOrderOfFrequency {

    public static void main(String[] args) {

        String input = "banana";
        doPrintCharactersInDescendingOrderOfFrequency(input);
    }

    private static void doPrintCharactersInDescendingOrderOfFrequency(String input) {

        Map<Character , Integer> map = new HashMap<>();
        int length = input.length();
        for (int i = 0; i < length; i++) {
            char ch = input.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch , map.get(ch) + 1);
            } else {
                map.put(ch , 1);
            }
        }

//        LinkedHashMap<Character , Integer> sortedMap = new LinkedHashMap<>();
//        map.entrySet().stream()
//                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//                .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
//        sortedMap.forEach((key, value) -> {
//            System.out.println("Key is : " + key  + " , value is  : " + value);
//        });

        Set<Map.Entry<Character, Integer>> set = map.entrySet();
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(set);
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for (Map.Entry<Character, Integer> entry:  list) {
            System.out.println("Key is : " + entry.getKey()  + " , value is  : " + entry.getValue());
        }
    }
}
