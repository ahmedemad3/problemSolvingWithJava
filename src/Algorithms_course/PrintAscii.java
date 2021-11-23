package Algorithms_course;

public class PrintAscii {

    public static void main(String[] args) {

        char ch = 'A';
        printAsciiOfCharacters(ch);
    }

    private static void printAsciiOfCharacters(char ch) {

        Integer ascii = Integer.valueOf(ch);
        System.out.println(ascii);
    }
}
