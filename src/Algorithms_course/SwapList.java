package Algorithms_course;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapList {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("dsdsdsdsd");
        list.add("asdsdas");
        swapListUsingCollections(list);
    }

    private static void swapListUsingCollections(List<String> list) {

        Collections.swap(list , 0 , list.size()-1);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
