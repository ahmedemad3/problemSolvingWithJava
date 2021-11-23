package Algorithms_course;

public class PrintFirstLetterInEachWordInString {

    public static void main(String[] args) {

        String input = "Hello World to Our Community";

        printFirstLetterInEachWordInString(input);
    }

    private static void printFirstLetterInEachWordInString(String input) {

        String [] splitter = input.split(" ");
        for (int i = 0; i < splitter.length; i++) {
            String word = splitter[i];
            System.out.println(word.charAt(0));
        }

    }
}
