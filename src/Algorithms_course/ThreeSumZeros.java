package Algorithms_course;

import java.util.ArrayList;
import java.util.List;

public class ThreeSumZeros {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(-1);
        list.add(-4);

        getThreeSumZeros(list); // a + b + c = 0;
    }

    private static void getThreeSumZeros(List<Integer> list) {
        List<List<Integer>> subLists = new ArrayList<>();
        List<List<Integer>> threeSumList = new ArrayList<>();
        // get all possible subLists of three elements
        getAllSubLists(subLists , list);
        for (int i = 0; i < subLists.size(); i++) {
            List<Integer> sub = subLists.get(i);
            int sum = sub.stream().mapToInt(Integer::intValue).sum();
            if(sum == 0)
                threeSumList.add(sub);
        }


        // print threeSumList
        for (int i = 0; i < threeSumList.size(); i++) {
            List<Integer> sub = subLists.get(i);
            System.out.println(sub.toString());
        }
    }

    private static void getAllSubLists(List<List<Integer>> subLists, List<Integer> list) {
        int length = list.size();
        for (int i = 0; i < length; i++) {
            Integer element = list.get(i);
            List<Integer> sub = list.subList(i+1 , length);
            if(sub.size() >= 2)
                getSubLists( 0 , element , sub ,  subLists);
        }

        // print subLists
        System.out.println("subLists : " + subLists.size());
//        for (int i = 0; i < subLists.size(); i++) {
//            List<Integer> sub = subLists.get(i);
//            System.out.println(sub.toString());
//        }

    }

    private static void getSubLists( int start, Integer element, List<Integer> subList, List<List<Integer>> subLists) {

        List<Integer> list = new ArrayList<>();
        list.add(element);
        int end = start + 2;
        if (end <= subList.size()){
            for (int i = start; i < end; i++) {
                list.add(subList.get(i));
            }
            subLists.add(list);
            start++;
            getSubLists(start , element , subList , subLists);
        }
    }
}
