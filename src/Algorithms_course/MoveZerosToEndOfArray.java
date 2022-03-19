package Algorithms_course;

public class MoveZerosToEndOfArray {

    public static void main(String[] args) {

        int [] input = new int[] {0 , 0 , 30 , 40 , 0 , 60 , 80};
        doMoveZerosToEndOfArray(input);
    }

    private static void doMoveZerosToEndOfArray(int[] input) {

        // Time is O(N) space is O(N)

        int forwardPosition = 0 ;
        int length = input.length;
        int backWordPosition = length - 1;

        int [] res = new int[length];

        for (int i = 0; i < length ; i++) {
            if(forwardPosition <= backWordPosition){
                if(input[i] == 0 ){
                    res[backWordPosition] = input[i];
                    backWordPosition--;
                } else {
                    res[forwardPosition] = input[i];
                    forwardPosition++;
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
