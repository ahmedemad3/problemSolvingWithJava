package Algorithms_course;

import java.util.Arrays;

public class MoveNegativeNumbersToStartOfArray {

    public static void main(String[] args) {

        int [] input = new int[] {-10 , -20 , 30 , 40 , -50 , 60 , 70};

        doMoveNegativeNumbersToStartOfArray(input);
        doMoveNegativeNumbersToStartOfArrayV2(input);
    }

    private static void doMoveNegativeNumbersToStartOfArrayV2(int[] input) {
        int length = input.length;
        Arrays.sort(input);
        for (int i = 0; i < length; i++) {
            System.out.println("V2 : " + input[i]);
        }

    }

    private static void doMoveNegativeNumbersToStartOfArray(int[] input) {

        // Time is O(N) space is O(N)

        int forwardPosition = 0 ;
        int length = input.length;
        int backWordPosition = length - 1;

        int [] res = new int[length];

        for (int i = 0; i < length ; i++) {
             if(forwardPosition <= backWordPosition){
                 if(input[i] < 0 ){
                     res[forwardPosition] = input[i];
                     forwardPosition++;
                 } else {
                     res[backWordPosition] = input[i];
                     backWordPosition--;
                 }
             } else {
                 break;
             }
        }

        for (int i = 0; i < length; i++) {
            System.out.println(res[i]);
        }

    }
}
