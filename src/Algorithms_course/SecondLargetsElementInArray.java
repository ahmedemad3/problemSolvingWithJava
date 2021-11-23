package Algorithms_course;

import java.util.Arrays;

public class SecondLargetsElementInArray {

    public static void main(String[] args) {

        int[] input = new int[]{1 , 2, 5, 8 , 10}; // 8
//        findSecondLargestElementInArray(input);
        findSecondLargestElementInArrayV2(input);
    }

    private static void findSecondLargestElementInArrayV2(int[] input) {
        
        // sort Array ascending
        Arrays.sort(input);
        System.out.println(input[input.length-2]);
        
    }

    private static void findSecondLargestElementInArray(int[] input) {

        int max = Integer.MIN_VALUE;
        int length = input.length;
        for (int i = 0; i < length; i++) {
            if(input[i] > max)
                max = input[i];
        }

        System.out.println("max : " + max);

        int min = Integer.MAX_VALUE;
        int secondLargest = -1;
        for (int i = 0; i < length; i++) {
            if(max - input[i] < min && max != input[i]){
                min = max - input[i];
                secondLargest = input[i];
            }
        }

        System.out.println(" secondLargest : " + secondLargest);

    }
}
