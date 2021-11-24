package Algorithms_course;

import java.util.*;
import java.util.stream.Stream;

public class KthMostFrequentlyInString {

    public static void main(String[] args) {
        String input = "mississippi";
        int K = 2;
        System.out.println(findMostFrequently(input , K));
    }

    private static Character findMostFrequently(String input, int k) {
        // hashmap
        // order descending
        // based on Kth get the relevant
        // Time is O(N) space is O(N)

        Map<Character , Integer> treeMap = new HashMap<>();
        int length = input.length();
        for (int i = 0; i < length; i++) {
            char ch = input.charAt(i);
            if(treeMap.containsKey(ch)){
                treeMap.put(ch , treeMap.get(ch) + 1);
            } else {
                treeMap.put(ch , 1);
            }
        }

//        treeMap.forEach((character, integer) -> {
//            System.out.println("Key : " + character + " , val : " + integer);
//        });

        List<Map.Entry> list = new ArrayList<>(treeMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry>() {
            @Override
            public int compare(Map.Entry o1, Map.Entry o2) {
                Integer val1 = (Integer) o1.getValue();
                Integer val2 = (Integer) o2.getValue();
                return val2.compareTo(val1);
            }
        });

//        list.forEach(entry -> {
//            System.out.println("Key : " + entry.getKey() + " , val : " + entry.getValue());
//        });

        if(list.size() > k )
            return (Character)list.get(k).getKey();
        return null;
    }
}
