package Algorithms_course;

import javafx.print.PaperSource;

public class MultiplicationTable {


    public static void main(String[] args) {
        int number = 7;
        getTheMultiplicationTableOfNumber(number);
    }

    private static void getTheMultiplicationTableOfNumber(int number) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("Multiplication of " + number + " = "+number + " * " + i + " = " + number*i );
        }
    }
}
