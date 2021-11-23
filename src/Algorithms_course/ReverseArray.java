package Algorithms_course;

import java.util.Arrays;

public class ReverseArray {

    /**
     * Given an example of array {10 , 20 , 30 , 40 } ==> {40, 30 , 20 , 10}
     * @param args
     */
    public static void main(String[] args) {
        int [] arr ={10 , 20 , 30 , 40 , 15};
        reverse(arr);
    }

    private static void reverse(int[] arr) {
        int low = 0;
        int high = (arr.length - 1);
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
