package Algorithms_course;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicateOccure {

    public static void main(String[] args) {

        int [] input = new int[] {1,2,3,1,5,4};
        System.out.println(getFirstDuplicateInArray(input));

    }

    private static int getFirstDuplicateInArray(int[] input) {
        int length = input.length;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < length; i++) {
            if(set.contains(input[i]))
                return input[i];
            else
                set.add(input[i]);
        }
        return -1;
    }
}

