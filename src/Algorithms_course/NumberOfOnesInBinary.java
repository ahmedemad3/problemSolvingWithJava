package Algorithms_course;

public class NumberOfOnesInBinary {

    public static void main(String[] args) {
        int number = 5;
//        countNumberOfOnesInBinary(number);
        countNumberOfOnesInBinaryV2(number);
    }

    private static void countNumberOfOnesInBinaryV2(int number) {

        int count = 0;
        while (number > 0 ){
            System.out.println("% == " + number % 2);
            count+= number % 2;
            number = number / 2;
        }
        System.out.println(count);
    }

    private static void countNumberOfOnesInBinary(int number) {

        String binary = Integer.toBinaryString(number);
        int count = 0;
        for (int i = 0; i < binary.length(); i++) {
            char ch = binary.charAt(i);
            if(ch == '1')
                count++;
        }

        System.out.println(count);
    }
}
