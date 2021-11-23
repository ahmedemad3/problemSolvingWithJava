package Algorithms_course;

public class PrintEvenLengthOfWord {

    public static void main(String[] args) {

        String input = "Hell world ya prince";

        doPrintEvenLengthOfWord(input);
    }

    private static void doPrintEvenLengthOfWord(String input) {

        String[] splitter = input.split(" ");
        for (int i = 0; i < splitter.length; i++) {
            String element = splitter[i];
            if(element.length() % 2 ==0 )
                System.out.println(element);
        }
    }
}
