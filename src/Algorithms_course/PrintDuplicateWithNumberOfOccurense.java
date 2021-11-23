package Algorithms_course;

import java.util.*;

public class PrintDuplicateWithNumberOfOccurense {

    public static void main(String[] args) {
        String input = "helloworld";  // e : 2
        System.out.println(printDuplicateWithNumberOfPOccurense(input));
     }

    private static String printDuplicateWithNumberOfPOccurense(String input) {

        StringBuilder builder = new StringBuilder();
        Map<Character , Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char ch= input.charAt(i);
            if(map.containsKey(ch)){
                int count = map.get(ch).intValue();
                count++;
                map.put(ch , count);
            }else{
                map.put(ch , 1);
            }
        }
        int maxCount = Collections.max(map.values()).intValue();
        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == maxCount){
                builder.append(entry.getKey()).append(":").append(maxCount);
                break;
            }
        }

        return builder.toString();
    }
}
