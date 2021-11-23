package Algorithms_course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindPairOfSum {

    public static void main(String[] args) {

        int sum = 50;
        Integer[] input = new Integer[]{10 , 20 , 30 , 40 , 50};

        doFindPairOfSum(input , sum);

    }

    private static void doFindPairOfSum(Integer[] input, int sum) {

        int length = input.length;
        List<Integer> list = Arrays.asList(input);
        for (int i = 0; i < length; i++) {
            Integer element = list.get(i);
            Integer rest  =  sum - element;
            if(list.contains(rest)){
                System.out.println("The pairs is : " + "[" + element + " , " + rest + " ]");
            }
        }


    }
}
