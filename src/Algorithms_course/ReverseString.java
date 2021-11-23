package Algorithms_course;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(doReverseString("egypt"));
        System.out.println(doReverseStringV2("egypt"));
    }

    private static String doReverseStringV2(String value) {
        StringBuilder builder = new StringBuilder();
        String [] splitter = value.split("");
        for (int i = splitter.length-1; i >= 0; i--) {
            builder.append(splitter[i]);
        }
        return builder.toString();
    }

    private static String doReverseString(String value) {

        StringBuilder builder = new StringBuilder();
        String [] splitter = value.split("");
        int forwardPosition = 0;
        int backWordPosition = splitter.length-1;
        for (int i = splitter.length-1; i >= 0; i--) {
            if(forwardPosition < backWordPosition){
                String temp = splitter[forwardPosition];
                splitter[forwardPosition] = splitter[i];
                splitter[i] = temp;
                forwardPosition++;
                backWordPosition--;
            }
        }

        Arrays.stream(splitter).forEach(s -> {
            builder.append(s);
        });

        return builder.toString();
    }
}
