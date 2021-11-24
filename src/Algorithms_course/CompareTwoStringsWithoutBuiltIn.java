package Algorithms_course;

public class CompareTwoStringsWithoutBuiltIn {

    public static void main(String[] args) {

        String input_1 = "JAVA";
        String input_2 = "JAVk";
//        compareTwoStrings(input_1 , input_2);
        compareTwoStringsV2(input_1 , input_2);
    }

    private static void compareTwoStringsV2(String input_1, String input_2) {

        // time complexity is O(n)  space is O(n)
        if(input_1.length() != input_2.length())
            System.out.println("Not Identical");

        int length = input_1.length();
        boolean equal  = true;
        for (int i = 0; i < length; i++) {
            if(input_1.charAt(i) != input_2.charAt(i)){
                equal = false;
                break;
            }
        }

        if(equal)
            System.out.println("Identical");
        else
            System.out.println("Not Identical");
    }


    private static void compareTwoStrings(String input_1, String input_2) {

        String[] splitter_1= input_1.split("");
        if(input_1.length() != input_2.length())
            System.out.println("Not Identical");

        boolean isIdentical = false;
        for (int i = 0; i < splitter_1.length; i++) {
            String element= splitter_1[i];
            if(input_2.indexOf(element) > 0)
                isIdentical = true;
            else{
                isIdentical = false;
                break;
            }

        }
        if (isIdentical)
            System.out.println("Identical");
        else
            System.out.println("Not Identical");

    }


}
