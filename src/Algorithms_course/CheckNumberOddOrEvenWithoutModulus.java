package Algorithms_course;

public class CheckNumberOddOrEvenWithoutModulus {

    public static void main(String[] args) {
        int number = 3;

        isNumberOddOrEvenWithoutModulus(number);
        isNumberOddOrEvenWithoutModulusV2(number);
    }

    private static void isNumberOddOrEvenWithoutModulusV2(int number) {
        // Time Complexity is O(1) space is O(1)
        // Using Mathematical Operation
        int res = (number/2) * 2;
        if(res == number)
            System.out.println("is even");
        else
            System.out.println("is odd");


    }

    private static void isNumberOddOrEvenWithoutModulus(int number) {
        // using recursion by subtract number by 2 and check if number is equal 0 or not
        // Time Complexity is O(N logN) space is O(n)
        if(number >= 2){
            number = number - 2;
            isNumberOddOrEvenWithoutModulus(number);
        }else {
            if(number != 0)
                System.out.println("is odd");
            else
                System.out.println("is even");
        }
    }


}
