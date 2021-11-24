package Algorithms_course;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateArrayList {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(2);

        System.out.println(isArrayListHaveDuplicates(list));
    }

    private static boolean isArrayListHaveDuplicates(List<Integer> list) {

        // Time is O(N) Space O(n)
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            set.add(list.get(i));
        }
        if(set.size() != list.size())
            return true;
        else
            return false;
    }
}
