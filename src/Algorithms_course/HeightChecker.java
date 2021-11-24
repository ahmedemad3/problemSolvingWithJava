package Algorithms_course;

import java.util.Arrays;

public class HeightChecker {

    // https://leetcode.com/problems/height-checker/
    public static void main(String[] args) {
        int[] heights = new int[] {1,1,4,2,1,3};

        System.out.println(heightChecker(heights));
    }

    private static int heightChecker(int[] heights) {

        //  Time is O(n) Space is O(n)
        int length = heights.length;
        int[] expected = new int[length];

        for (int i = 0; i < length; i++) {
            expected[i] = heights[i];
        }

        Arrays.sort(expected);

        int count = 0;

        for (int i = 0; i < length; i++) {
            if(heights[i] != expected[i])
                count++;
        }
        return count;
    }


}
