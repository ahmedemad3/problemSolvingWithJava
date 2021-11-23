package Algorithms_course;

public class SumOfDigitNumber {

    public static void main(String[] args) {
        int input = 123;
        System.out.println(getSumOfDigitInNumber(input));

    }

    private static int  getSumOfDigitInNumber(int input) {
        int sum = 0;
        int digit = 0;
//       String [] splitter = String.valueOf(input).split("");
//       for (String value : splitter){
//           try {
//               Integer num = Integer.parseInt(value);
//               sum = sum + num;
//           }catch (NumberFormatException e){
//               System.out.println("Invalid number format exception");
//               return 0;
//           }
//       }

//        while (input > 0){
//            digit = input % 10;
//            sum = sum + digit;
//            input = input/10;
//        }


//        String value = String.valueOf(input);
//        for (int i = 0; i < value.length(); i++) {
//            char num = value.charAt(i);
//            sum = sum + Character.getNumericValue(num);
//        }
       return sum;
    }
}
