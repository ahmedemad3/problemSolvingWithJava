package Algorithms_course;

public class SwapTwoNumbers {

    public static void main(String[] args) {

        swapTwoNumbersWithoutTempVariable(10 , 20);
    }

    private static void swapTwoNumbersWithoutTempVariable(int num1, int num2) {

        num2 = num2 - num1;
        num1 = num2 + num2;

        System.out.println(num1);
        System.out.println(num2);
    }
}
