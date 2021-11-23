package Algorithms_course;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MergeArrays {

    public static void main(String[] args) {
        int[] firstArr = new int[]{1 , 3, 5, 0, 0, 0};
        int[] secondArr = new int[]{2 , 4, 6};
        try {
            doMergeArrays(firstArr , secondArr);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    private static void doMergeArrays(int[] firstArr, int[] secondArr) throws Exception {

        int length_1 = firstArr.length;
        int length_2 = secondArr.length;
        if(length_1 + length_2 > length_1)
            throw new Exception();
        Arrays.sort(firstArr);
        int position = 0;
        for (int i = 0; i < length_1 ; i++) {
            if(firstArr[i] == 0){
                firstArr[i] = secondArr[position];
                position++;
            }
        }
        Arrays.sort(firstArr);
        for (int i = 0; i < length_1; i++) {
            System.out.println(firstArr[i]);
        }

    }
}
