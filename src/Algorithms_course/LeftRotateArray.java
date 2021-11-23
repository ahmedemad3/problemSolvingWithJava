package Algorithms_course;

public class LeftRotateArray {

    public static void main(String[] args) {

        int[] input = new int[]{10 , 20 , 30 , 40 , 50};

//        shiftArrayToLeftSide(input);
//        shiftArrayToRightSide(input);
    }

    private static void shiftArrayToRightSide(int[] input) {
        int length = input.length;
        int temp = input[length - 1];
        for (int i = length-2; i >= 0; i--) {
            input[i+1] = input[i];
        }
        input[0] = temp;
        System.out.println("shiftArrayToRightSide");
        for (int i = 0; i < length; i++) {
            System.out.println(input[i]);
        }
    }

    private static void shiftArrayToLeftSide(int[] input) {

        int temp = input[0];
        int length = input.length;
        for (int i = 1; i < length; i++) {
            input[i-1] = input[i];
        }
        input[length - 1] = temp;
        System.out.println("shiftArrayToLeftSide");
        for (int i = 0; i < length; i++) {
            System.out.println(input[i]);
        }
    }
}
