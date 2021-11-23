package Algorithms_course;

import java.util.HashSet;
import java.util.Set;

public class CountElement {

    public static void main(String[] args) {
//        int [] arr = {1 , 2 , 3};
        int [] arr = {1 , 3 , 2 , 3 , 5 , 0};
//        int [] arr = {1 , 1 , 2 , 2} ;
        calculateElements(arr);

    }


    private static void calculateElements(int[] arr) {
        int length = arr.length;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < length; i++) {
            set.add(arr[i]);
        }
        int count = 0;
        for (int i = 0; i < length; i++) {
           if(set.contains(arr[i] + 1))
               count++;
        }

        System.out.println("Count : " + count);
    }
}
