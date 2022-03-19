package Algorithms_course;

public class Palindromes {

    public static void main(String[] args) {

        int[] input = new int[]{1 , 2, 1};
        System.out.println(isPalindromes(input));
        System.out.println(isPalindromesV2(input));
    }

    private static boolean isPalindromesV2(int[] input) {
        if(input[0] != input[input.length-1])
            return false;
        else {
            for (int i = 0; i < input.length; i++) {
                if(input[i] != input[input.length-1-i])
                    return false;
            }
        }

        return true;
    }

    /**
     * Check array is Palindromes
     * @param input
     * @return
     */
    private static boolean isPalindromes(int[] input) {

        // Time is O(N) Space is O(N)
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
//        for (int i = length-1; i >=0 ; i--) {
//            traverseInput[length-1 - i] = input[i];
//        }
        for (int i = 0; i < length ; i++) {
            traverseInput[i] = input[length-1 - i];
        }
        return traverseInput;
    }
}
