package Algorithms_course;

public class FactorsOfNumber {

    public static void main(String[] args) {

        int number = 45;
        findFactorsOfNumber(number);
    }

    private static void findFactorsOfNumber(int number) {

        // Time is O(n) space is O(1)

        for (int i = 1; i <=number ; i++) {
            if(number % i == 0)
                System.out.println(i + " is factor of " + number);
        }
    }
}
