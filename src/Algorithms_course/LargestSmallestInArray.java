package Algorithms_course;

public class LargestSmallestInArray {


    public static void main(String[] args) {

        int[] input = new int[]{15, 2, 5, 8 , 10};
        findLargestAndSmallestInArray(input);
    }

    private static void findLargestAndSmallestInArray(int[] input) {

        // Time is O(N) space is O(1)

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < input.length; i++) {
            if(input[i] > max)
                max = input[i];
            if(input[i] < min)
                min = input[i];
        }

        System.out.println("MAX : " + max);
        System.out.println("MIN : " + min);
    }
}
