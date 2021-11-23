package Algorithms_course;

public class FibonacciSeries {

    public static void main(String[] args) {

        int number = 10; // 0 1 1 2 3 5 8 13 21 34
        printFibonacciSeries(number);
    }

    private static void printFibonacciSeries(int number) {

        int result = 0;
        int current = 0;
        System.out.println(current);
        int previous = ++current;
        for (int i = 2; i <= number; i++) {
            int temp = result;
            result = previous + result;
            previous = temp;
            System.out.println(result);
        }

    }
}
