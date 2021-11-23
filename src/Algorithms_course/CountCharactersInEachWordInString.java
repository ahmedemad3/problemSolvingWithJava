package Algorithms_course;

public class CountCharactersInEachWordInString {

    public static void main(String[] args) {
        String input = "Hello World";
        countCharactersInEachWord(input);
    }

    private static void countCharactersInEachWord(String input) {

        String[] splitter = input.split(" ");
        for (int i = 0; i < splitter.length; i++) {
            char[] elements = splitter[i].toCharArray();
            System.out.println("Word : " + splitter[i] + "  , No of Characters : " + elements.length);

        }
    }
}
