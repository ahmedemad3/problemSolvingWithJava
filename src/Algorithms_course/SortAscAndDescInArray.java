package Algorithms_course;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortAscAndDescInArray {

    public static void main(String[] args) {

        int[] input = new int[]{10 , 1 , 2 , 6 , 3, 5 , 4};

//        sortAscending(input);
//        sortDescending(input);

//        sortAscendingV2(input);
        sortDescendingV2(input);

    }

    private static void sortDescendingV2(int[] input) {
        int length = input.length;
        Integer [] data = Arrays.stream( input ).boxed().toArray( Integer[]::new );
        Arrays.sort(data, Collections.reverseOrder());

        for (int i = 0; i < length; i++) {
            System.out.println(data[i]);
        }
    }

    private static void sortAscendingV2(int[] input) {
        int length = input.length;
        Arrays.sort(input);
        for (int i = 0; i < length; i++) {
            System.out.println(input[i]);
        }
    }

    private static void sortAscending(int[] input) {

        int length = input.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if(input[i] < input[j]){
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.println(input[i]);
        }

    }

    private static void sortDescending(int[] input) {

        int length = input.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if(input[i] > input[j]){
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.println(input[i]);
        }
    }
}
