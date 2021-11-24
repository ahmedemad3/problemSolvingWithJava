package Algorithms_course;

import java.util.*;

/**
 * Booking.com Question
 */
public class CheckElementInAtLeastTwoArrays {

    public static void main(String[] args) {

        // 1 , 2, 3, 4 , 5, 6 , 7 , 8 , 9
        Integer[] arr_1 = new Integer[]{1 , 2 , 3 , 4 , 5};
        Integer[] arr_2 = new Integer[]{1 , 5 , 6 , 7 , 8};
        Integer[] arr_3 = new Integer[]{2 , 3 , 7 , 8 , 9 };
        // 1 , 2 , 3 , 5 , 7 , 8

        isElementInAtLeastTwoArrays(arr_1 , arr_2 , arr_3);

    }

    private static void isElementInAtLeastTwoArrays(Integer[] arr_1, Integer[] arr_2, Integer[] arr_3) {

        // time complexity O(n) space O(n)
        // Create Set and add all elements to be unique
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr_1.length; i++) {
            set.add(arr_1[i]);
            set.add(arr_2[i]);
            set.add(arr_3[i]);
        }

        // Convert all arrays to arrayList
        List<Integer> arr_1_list= Arrays.asList(arr_1);
        List<Integer> arr_2_list= Arrays.asList(arr_2);
        List<Integer> arr_3_list= Arrays.asList(arr_3);

        List<Integer> atLeastTwoList = new ArrayList<>();

        // For loop on Set and Count if count >= 2 add to List "atLeastTwoList"
        for (Integer value :set) {
            int count =0;
            if(arr_1_list.indexOf(value) > -1)
                count++;
            if(arr_2_list.indexOf(value) > -1)
                count++;
            if(arr_3_list.indexOf(value) > -1)
                count++;

            if(count >= 2)
                atLeastTwoList.add(value);
        }

        atLeastTwoList.forEach(value -> {
            System.out.println(value);
        });
    }
}
