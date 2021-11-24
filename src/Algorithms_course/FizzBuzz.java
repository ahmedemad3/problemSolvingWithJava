package Algorithms_course;

public class FizzBuzz {

    public static void main(String[] args) {
        int number = 10;
        displayFizzBuzz(number);
    }

    private static void displayFizzBuzz(int number) {
        // Time is O(N) space is O(N)
        for (int i = 1; i <= number; i++) {
           if(i % 3== 0 && i % 5 ==0 ) System.out.println("FizzBuzz");
           else if (i % 3== 0) System.out.println("Fizz");
           else if (i % 5 ==0) System.out.println("Buzz");
           else System.out.println(i);
        }
    }


}
