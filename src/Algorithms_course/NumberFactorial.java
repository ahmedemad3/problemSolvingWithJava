package Algorithms_course;

public class NumberFactorial {

    public static void main(String[] args) {
        int number= 5;
        getNumberFactorial(number);
//        System.out.println(getNumberFactorialWithRecursion(number));
    }

    private static int getNumberFactorialWithRecursion(int number) {
        if(number > 1)
            return number * getNumberFactorialWithRecursion(( number - 1));
        return 1;
    }

    private static void getNumberFactorial(int number) {
        int res = 1;
        while (number > 1){
            res = res  * (number);
            number = number-1;
        }

        System.out.println("res : " + res);
    }



}
