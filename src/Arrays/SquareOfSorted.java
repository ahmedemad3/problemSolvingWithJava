package Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfSorted {

    public static void main(String[] args) {
          int[] sorted =  sortedSquares(new int[]{-7,-3,2,3,11});
        for (int i = 0; i < sorted.length; i++) {
            System.out.println(sorted[i]);
        }
    }

    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int val = (nums[i] * nums[i]);
            nums[i] = val;
        }
        List<Integer> list =  Arrays.stream(nums).boxed().collect(Collectors.toList());
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());

        return sortedList.stream().mapToInt(i->i).toArray();
    }
}
