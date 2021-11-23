package Crokking_Algorithm.Ch1.Ch2;

import java.util.*;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = new int[]{11 , 3, 1, 2 , 12};
        System.out.println(sortAscending(arr));
    }

    public static int [] sortAscending(int [] arr){

        // find the index of smallest one in array
        //add this one to the new array
        int length = arr.length;
        int [] newOne = new int[length];
        for (int i = 0; i < length; i++) {
            int smallestIndex = findSmallestElementIndex(arr);
            newOne[i] = arr[smallestIndex];
            arr[smallestIndex] = 0;
        }
        for (int i = 0; i < newOne.length; i++) {
            System.out.println(newOne[i]);
        }


        return newOne;
    }

    private static int findSmallestElementIndex(int[] arr) {
        int smallest = arr[0];
        int smallIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                smallest = arr[i];
                smallIndex = i;
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0 && arr[i] < smallest){
                smallest = arr[i];
                smallIndex = i;
            }
        }
        return smallIndex;
    }


}
