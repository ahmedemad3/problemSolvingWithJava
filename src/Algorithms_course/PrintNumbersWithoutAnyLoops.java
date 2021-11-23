package Algorithms_course;

public class PrintNumbersWithoutAnyLoops {

    public static void main(String[] args) {
        int number = 20;

        printWithoutAnyLoops(number);
    }

    private static void printWithoutAnyLoops(int number) {
        if(number > 0){
            System.out.println(number);
            printWithoutAnyLoops(number-1);
        }

    }
}
