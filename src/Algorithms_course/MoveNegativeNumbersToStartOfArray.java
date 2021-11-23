package Algorithms_course;

public class MoveNegativeNumbersToStartOfArray {

    public static void main(String[] args) {

        int [] input = new int[] {-10 , -20 , 30 , 40 , -50 , 60 , 70};

        doMoveNegativeNumbersToStartOfArray(input);
    }

    private static void doMoveNegativeNumbersToStartOfArray(int[] input) {

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
