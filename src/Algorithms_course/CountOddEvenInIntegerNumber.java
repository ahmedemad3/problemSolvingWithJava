package Algorithms_course;

public class CountOddEvenInIntegerNumber {

    public static void main(String[] args) {
        int number = 123;
//        countOddEven(number);
        countOddEvenV2(number);
        System.out.println(reverseNumber(number));
    }

    private static Integer reverseNumber(int number) {

        // Time is O(N) Space is O(N)
        if(number == 0 ) return number;
        String reverseNumber = "";
        while (number > 0 ){
            int remaining = number % 10;
            reverseNumber = reverseNumber + remaining;
            number = number / 10;
        }

        return Integer.valueOf(reverseNumber);
    }


    private static void countOddEvenV2(int number) {

        // Time is O(N) Space is O(1)
        int evenCount = 0;
        int oddCount = 0;
        while (number > 0 ){
            int remining = number % 10;
            if(remining % 2 == 0){
                evenCount ++;
            }else
                oddCount++;

            number = number / 10;
        }

        System.out.println("evenCount : " + evenCount);
        System.out.println("oddCount : " + oddCount);
    }

    private static void countOddEven(int number) {

        // Time is O(N) Space is O(N)
        String even = "";
        String input = String.valueOf(number);
        for (int i = 0; i < input.length(); i++) {
            char ch= input.charAt(i);
            if(Integer.parseInt(String.valueOf(ch)) % 2 == 0)
                even = even+ ch;
        }
        int evenCount = even.length();
        int oddCount =input.length() - evenCount;
        System.out.println("evenCount : " + evenCount);
        System.out.println("oddCount : " + oddCount);

    }
}
