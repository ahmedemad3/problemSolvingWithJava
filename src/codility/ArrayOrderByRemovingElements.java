package codility;

import java.util.ArrayList;
import java.util.List;

public class ArrayOrderByRemovingElements {
    /**
     *
     * Given an array of integers, the task is to remove elements from the array to make array sorted.
     * That is, remove the elements which do not follow an increasing order.
     *
     * Examples:
     *
     * Input: arr[] = {1, 2, 4, 3, 5, 7, 8, 6, 9, 10}
     * Output: 1 2 4 5 7 8 9 10
     *
     * Input: arr[] = {10, 12, 9, 5, 2, 13, 14}
     * Output: 10 12 13 14
     */

    public static void main(String[] args) {
        int[] array = {10, 12, 9, 5, 2, 13, 14}; // 1 2 5 6 7 8      remove 4 9
        System.out.println(returnValidSortedArray(array));
    }

    private static List<Integer> returnValidSortedArray(int[] array) {
        List<Integer> list = new ArrayList<>();
        int lastElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= lastElement){
                list.add(array[i]);
                lastElement = array[i];
            }
        }
        return list;
    }
}
