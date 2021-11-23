package Algorithms_course;

public class SumOfFirstLastNumber {


    public static void main(String[] args) {

        int number = 123;
        System.out.println(sum(number));

    }

    private static int sum(int number) {
        int sum = 0;
        int length = String.valueOf(number).length();
        int last =  number % 10 ;
        double expo = Math.pow(10d , length -1);
        int first = Double.valueOf((number / expo)).intValue();
        System.out.println("Last : " + last + " , First : " + first + " , length : " + length);
        sum = first + last;
        return sum;
    }
}
