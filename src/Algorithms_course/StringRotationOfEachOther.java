package Algorithms_course;

public class StringRotationOfEachOther {

    public static void main(String[] args) {

        String input = "abcd"; // abcdabcd
        String rotated = "cabd";

        System.out.println(isRotated(input , rotated));
    }

    private static boolean isRotated(String input, String rotated) {

        if(input == null || rotated == null)
            return false;
        else if(input.length() != rotated.length())
            return false;
        else {
            String comparisonStr = input + input;
            return comparisonStr.contains(rotated);

        }
    }
}
