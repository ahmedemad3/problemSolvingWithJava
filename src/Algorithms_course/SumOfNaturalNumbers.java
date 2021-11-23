package Algorithms_course;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {

        int number = 10;
        findSumOfNaturalNumbers(number);
        findSumOfNaturalNumbersV2(number);
        System.out.println(findSumOfNaturalNumbersV3(number));

    }

    private static int findSumOfNaturalNumbersV3(int number) {
        if(number > 0){
            return  number + findSumOfNaturalNumbersV3((number-1));
        }
        return 0;
    }

    private static void findSumOfNaturalNumbersV2(int number) {
        int res = 0;
        while (number > 0){
            res = res + number;
            number--;
        }

        System.out.println(res);

    }

    private static void findSumOfNaturalNumbers(int number) {

        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }

        System.out.println(sum);
    }
}
