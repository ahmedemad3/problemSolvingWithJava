package Algorithms_course;

public class LargestOfThreeNumbers {

    /**
     * numbers 10 , 70 , 50 ==> 70
     * @param args
     */
    public static void main(String[] args) {
        int [] arr = {10 , 70 , 80};
        System.out.println(findLargestOfThreeNumbers(arr));
    }

    private static int findLargestOfThreeNumbers(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }

        return max;
    }
}
