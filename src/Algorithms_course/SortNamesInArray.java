package Algorithms_course;

import java.util.*;

public class SortNamesInArray {

    public static void main(String[] args) {
        String[] names = new String[]{"ahmed" , "mohamed" , "islam"}; // ahmed , islam , mohamed
        doSortNamesInArray(names);
    }

    private static void doSortNamesInArray(String[] names) {
        int length = names.length;
        for (int i = 0; i < length; i++) {
            for (int j = i+1; j < length; j++) {
                if(names[i].compareTo(names[j]) > 0 ){
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.println(names[i]);
        }
    }
}
