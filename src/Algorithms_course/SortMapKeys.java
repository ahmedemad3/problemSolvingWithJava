package Algorithms_course;

import java.util.HashMap;
import java.util.Map;

public class SortMapKeys {

    public static void main(String[] args) {

        Map<Integer , Integer> map = createMap();
        sortMapkeys(map);
    }

    private static void sortMapkeys(Map<Integer, Integer> map) {

        map.keySet().stream().sorted().forEach(key -> {
            System.out.println(key);
        });
    }

    private static Map<Integer, Integer> createMap() {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1 , 1);
        map.put(3 , 2);
        map.put(5 , 3);
        map.put(2 , 4);
        map.put(4 , 5);
        return map;
    }
}
