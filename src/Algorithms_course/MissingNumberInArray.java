package Algorithms_course;

public class MissingNumberInArray {

    public static void main(String[] args) {
        int size = 6;
        int[] input = new int[]{1 , 2 , 3 , 4 , 6};

        System.out.println(findMissingNumberInArray(size , input));
    }

    private static int findMissingNumberInArray(int size, int[] input) {

        // actual sum of array n(n+1) / 2  , expected sum of array

        int actual = (size*(size+1))/2;

        int  expectedSum = getSumOfArray(input);

        return actual - expectedSum;
    }

    private static int getSumOfArray(int[] input) {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum = sum+ input[i];
        }
        return sum;
    }


}
