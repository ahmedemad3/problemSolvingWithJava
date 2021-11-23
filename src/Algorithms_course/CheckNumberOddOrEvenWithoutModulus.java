package Algorithms_course;

public class CheckNumberOddOrEvenWithoutModulus {

    public static void main(String[] args) {
        int number = 3;

        isNumberOddOrEvenWithoutModulus(number);
        isNumberOddOrEvenWithoutModulusV2(number);
    }

    private static void isNumberOddOrEvenWithoutModulusV2(int number) {

        int res = (number/2) * 2;
        if(res == number)
            System.out.println("is even");
        else
            System.out.println("is odd");


    }

    private static void isNumberOddOrEvenWithoutModulus(int number) {
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
