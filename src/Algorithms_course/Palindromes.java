package Algorithms_course;

public class Palindromes {

    public static void main(String[] args) {

        int[] input = new int[]{1 , 2, 1};
        System.out.println(isPalindromes(input));
    }

    private static boolean isPalindromes(int[] input) {
        int length = input.length;
        int [] traverseInput = getTraverse(input);
        for (int i = 0; i <length ; i++) {
            if(input[i] != traverseInput[i])
                return false;
        }
        return true;
    }

    private static int[] getTraverse(int[] input) {
        int length = input.length;
        int[] traverseInput = new int[length];
        for (int i = length-1; i >=0 ; i--) {
            traverseInput[length-i-1] = input[i];
        }
        return traverseInput;
    }
}
