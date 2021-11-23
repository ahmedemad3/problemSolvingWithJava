package codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.List.*;

public class SumOfOdds {
    /**
     * Find all pairs in an array of integers that sum up to a given number
     */
    public static void main(String[] args) {
//        System.out.println(sumOfOdds(new Integer[]{1, 1, 2, 2, 3, 3, 3}));
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30); list.add(40); list.add(40);
        sumOfOdd(list);
        System.out.println("------------------");
    }

    public static int sumOfOdds(Integer [] a){
        int count = 0;

        for (int i = 0 ; i < a.length ; i++){
            if(a[i] % 2 != 0 )
                count = count + a[i];
        }
        return count;
    }

    private static void sumOfOdd(List<Integer> listOfSum) {

        int sum = listOfSum.stream()
                .filter(i -> Collections.frequency(listOfSum, i) % 2 != 0)
                .reduce(0, (a, b) -> a + b);

        System.out.println(sum);
    }
}
