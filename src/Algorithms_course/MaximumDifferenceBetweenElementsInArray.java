package Algorithms_course;

public class MaximumDifferenceBetweenElementsInArray {

    public static void main(String[] args) {
        int [] input = new int[] {10, 15, 30 , 45 , 50 , 60 , 80};
        findMaximumDifferenceBetweenElementsInArray(input);
    }

    private static void findMaximumDifferenceBetweenElementsInArray(int[] input) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int length = input.length;


        for (int i = 0; i < length; i++) {
            if(input[i] < min)
                min = input[i];
            if(input[i] > max)
                max = input[i];
        }

        int maxDiff = max - min;

        System.out.println("maxDiff : " + maxDiff + " , max is : " + max + " , min is : " + min);
    }
}
