package Algorithms_course;

import java.util.ArrayList;
import java.util.List;

public class SplitListToParts {

    public static void main(String[] args) {
        int noOfParts = 5;
        int[] list = new int[]{1,2,3};
        doSplitListToParts(list , noOfParts);
    }

    private static void doSplitListToParts(int[] input, int noOfParts) {

        int length = input.length;
        int noOfElementsPerPart = length >= noOfParts ? (length / noOfParts) : 1;
        List<List<Integer>> subLists  = new ArrayList<>();
        getSubList(noOfElementsPerPart , length , input , subLists , noOfParts);

        // print subLists
        for (int i = 0; i < subLists.size(); i++) {
            List<Integer> list = subLists.get(i);
            System.out.println(list.toString());
        }



    }

    private static void getSubList(int noOfElementsPerPart, int length, int[] input, List<List<Integer>> subLists, int noOfParts) {
        for (int i = 0; i < noOfParts; i++) {
            List<Integer> sub = new ArrayList<>();
            int start = i * noOfElementsPerPart;
            int end = start + noOfElementsPerPart;
            if(noOfParts - 1 == i){
                end = (length - start) + start;
            }
            if(end <= length){
                for (int j = start; j < end; j++) {
                    sub.add(input[j]);
                }
            }
            subLists.add(sub);
        }
    }
}
