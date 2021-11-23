package Algorithms_course;

import java.util.HashSet;
import java.util.Set;

public class Intersection {

    public static void main(String[] args) {
            int[] arr1 = new int[]{1 , 2, 3 , 4};
            int[] arr2 = new int[]{2, 5 , 4 , 7};
            getIntersectionBetweenTwoElements(arr1 , arr2);
    }

    private static void getIntersectionBetweenTwoElements(int[] arr1, int[] arr2) {
        // { 1 , 2, 3 , 4 }   , { 2, 5 , 4 , 7} // print 4
        // 2 for loop
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr2.length; j++) {
//                 if(arr1[i] == arr2[j]){
//                    System.out.println( "found intersection : " + arr1[i]);
//                 }
//            }
//        }   complexity O(n2)

//        Set<Integer> set = new HashSet<>(); // can replace with map
//        for (int i = 0; i < arr1.length; i++) {
//            set.add(arr1[i]);
//        }
//
//        for (int i = 0; i < arr2.length; i++) {
//            if(set.contains(arr2[i])){
//                System.out.println( "found intersection : " + arr2[i]);
//            }
//        } complexity O(n)

    }


}
