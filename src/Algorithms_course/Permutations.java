package Algorithms_course;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {
        int [] input = new int[]{1 ,2 , 3};
        getAllPermutations(input);
    }

    private static void getAllPermutations(int[] input) {

        List<List<Integer>> subList = new ArrayList<>();
        int length = input.length;
        if(length == 0)
            return;

        // get subs from forwards
        for (int i = 0; i < length; i++) {
            List<Integer> sub = new ArrayList<>();
            int element = input[i];
            sub.add(element);
            for (int j = 0; j < length; j++) {
                int subElement = input[j];
                if(element != subElement){
                    sub.add(subElement);
                }
            }
            subList.add(sub);
        }

        // get subs from backwards
        for (int i = 0; i < length; i++) {
            List<Integer> sub = new ArrayList<>();
            int element = input[i];
            sub.add(element);
            for (int k = length-1; k >= 0; k--) {
                int subElement = input[k];
                if(element != subElement){
                    sub.add(subElement);
                }
            }
            subList.add(sub);
        }

        // print subLists
        for (int i = 0; i < subList.size(); i++) {
            List<Integer> list = subList.get(i);
            System.out.println(list.toString());
        }

    }
}
