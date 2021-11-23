package codility;

import java.util.HashSet;
import java.util.Set;

public class FindSum {

    /*
     *
     * Given an array of integers and a value, determine if there are any two integers in the array whose
     * sum is equal to the given value.
     * Return true if the sum exists and return false if it does not.
     */



    static boolean findSumOfTwo(int[] A, int val) {
        Set<Integer> foundValues = new HashSet<Integer>();
        for (int a : A) {
            if (foundValues.contains(val - a)) {
                return true;
            }

            foundValues.add(a);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] v = new int[] {5, 7, 1, 2, 8, 4, 3};
        int[] test = new int[] {3, 20, 1, 2, 7};

        for(int i = 0; i < test.length; i++){
            boolean output = findSumOfTwo(v, test[i]);
            System.out.println("findSumOfTwo(v, " + test[i] + ") = " + (output ? "true" : "false"));
        }
    }
}
