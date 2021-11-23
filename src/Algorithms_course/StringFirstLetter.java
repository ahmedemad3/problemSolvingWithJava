package Algorithms_course;

public class StringFirstLetter {

    public static void main(String[] args) {
        String input = "Hello World";
        printStringFirstLetter(input);
    }

    private static void printStringFirstLetter(String input) {
        // split the string and then for each word print first letter

        String[] splitter = input.split(" ");
        for (String word : splitter){
            System.out.println(word.charAt(0));
        }
    }


}
