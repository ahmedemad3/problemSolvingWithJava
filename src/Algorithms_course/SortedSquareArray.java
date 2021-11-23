package Algorithms_course;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortedSquareArray {
    /**
     * given sorted array [-6 , -4 , 1 , 2 , 3 , 5] ==> [1 , 4 , 9 , 16 , 25 , 36]
     * @param args
     */
    public static void main(String[] args) {
        int [] arr = {-6 , -4 , 1 , 2 , 3 , 5};
//        sortSquareArray(arr);
        sortSquareArrayV2(arr);
    }

    private static int[] sortSquareArrayV2(int[] arr) {
        int length = arr.length;
        int[] result = new int[length];
        int left = 0;
        int right = length - 1;

        for (int i = length-1; i >=0 ; i--) {
            if(Math.abs(arr[left]) > arr[right]){
                result[i] = arr[left] * arr[left];
                left++;
            }else{
                result[i] = arr[right] * arr[right];
                right --;
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.println(result[i]);
        }
        return result;
    }


    private static void sortSquareArray(int[] arr) {
        int length = arr.length;
        Integer[] newOne = squareArray(arr);
//        Arrays.sort(newOne, Comparator.naturalOrder());
        Arrays.sort(newOne);
        for (int i = 0; i < length; i++) {
            System.out.println(newOne[i]);
        }
    }

    private static Integer[] squareArray(int[] arr) {
        int length = arr.length;
        Integer[] newOne = new Integer[length];
        for (int i = 0; i < length; i++) {
            newOne[i] = arr[i] * arr[i];
        }
        return newOne;
    }
}
