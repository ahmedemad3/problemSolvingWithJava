package Algorithms_course;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class DuplicateInArray {

    public static void main(String[] args) {

        int[] input = new int[]{ 10 , 1 ,2, 1, 3, 2 , 10 , 11};
        printDuplicateInArray(input);
    }

    private static void printDuplicateInArray(int[] input) {

        // map and count and if count more than 1 it's duplicate

        // Time is O(N) space is O(N)

        Map<Integer , Integer> map = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            if(map.containsKey(input[i])){
                map.put(input[i] , map.get(input[i]) + 1);
            }else {
                map.put(input[i] , 1);
            }
        }

        map.forEach((key, val) -> {
            if(val > 1){
                System.out.println(" key is : " + key);
            }
        });
    }


}
