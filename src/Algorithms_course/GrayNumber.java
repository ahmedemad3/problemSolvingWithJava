package Algorithms_course;

public class GrayNumber {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        System.out.println(isGray(num1 , num2));
    }

    private static boolean isGray(int num1, int num2) {
        int x = num1 ^ num2;
        System.out.println(x);
       return (x & (x-1))==0;
    }
}
