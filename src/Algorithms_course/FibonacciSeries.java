package Algorithms_course;

public class FibonacciSeries {

    public static void main(String[] args) {

        int number = 10; // 0 1 1 2 3 5 8 13 21 34
//        printFibonacciSeries(number);
        printFibonacciSeriesV2( 0 , 1 , number);
    }

    private static void printFibonacciSeriesV2(int first , int prev , int number) {

        // Time is O(n) space O(N)
        int counter = 0;
        while (counter < number){
            System.out.println(first);
            int result = first + prev;
            counter++;
            first = prev;
            prev = result;
        }
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
