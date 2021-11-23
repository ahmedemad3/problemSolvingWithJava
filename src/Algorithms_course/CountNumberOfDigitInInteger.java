package Algorithms_course;

public class CountNumberOfDigitInInteger {

    public static void main(String[] args) {
        Integer number = new Integer(646);
//        System.out.println(countNumberOfDigit(number));
        System.out.println(countNumberOfDigitV2(number));

    }

    private static int countNumberOfDigitV2(Integer number) {
        int count = 0;
        while (number > 0){
            number = number/10;
            count++;
        }
        return count;
    }

    private static int countNumberOfDigit(Integer number) {
       String value = String.valueOf(number.intValue());
       return value.length();
    }
}
