package Algorithms_course;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DisappearedNumbers {

    public static void main(String[] args) {

//        int[] nums = new int[]{1,1};
        int[] nums = new int[]{4,3,2,7,8,2,3,1};
        findDisappearedNumbers(nums);
    }

    private static List<Integer> findDisappearedNumbers(int[] nums) {

        // Time o(N) space is O(N)

        int length = nums.length;
        int totalNumbers = length;
        Set<Integer> set = new HashSet<>();
        List<Integer> res = new ArrayList<>();


        for (int i = 0; i <length ; i++) {
            set.add(nums[i]);
        }

        for (int i = 1; i <= length; i++) {
            if(!set.contains(totalNumbers)){
                res.add(totalNumbers);
            }
            totalNumbers--;
        }


//        for (int i = 0; i < res.size(); i++) {
//            System.out.println(res.get(i));
//        }

        System.out.println(res);

        return res;
    }
}
