package Algorithms_course;

public class ReverseOfNumber {

    public static void main(String[] args) {

        int number = 123;
        System.out.println(getReverseOfNumber(number));
    }

    private static int getReverseOfNumber(int number) {
        String reverseNumber ="";
        while (number > 0 ){
            int num = number %10 ;
            reverseNumber = reverseNumber + num;
            number = number / 10;
        }

        return Integer.valueOf(reverseNumber);
    }
}
