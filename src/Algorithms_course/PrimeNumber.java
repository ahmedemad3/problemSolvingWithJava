package Algorithms_course;

import javax.swing.text.html.ListView;

public class PrimeNumber {

    public static void main(String[] args) {
        int number = 22;
        System.out.println("is Prime ==  " + isPrime(number));
    }

    private static boolean isPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
           if(number % i == 0){
               isPrime = false;
               break;
           }
        }

        return isPrime;
    }
}
