package Algorithms_course;

import java.util.*;

public class ThirdMaximumNumber {

    public static void main(String[] args) {
        int[] nums = new int[]{2,2,3,1};
        System.out.println(thirdMax(nums));
    }


    public static int thirdMax(int[] nums) {

        int length = nums.length;
        int max = -1;
        if(length < 3){
            Integer[] res = Arrays.stream( nums ).boxed().toArray( Integer[]::new );
            max = getMax(res , length);
        } else {
            List<Integer> result = removeDuplicates(nums , length);
            if(result.size() < 3){
                Integer[] res = new Integer[result.size()];
                result.toArray(res);
                max = getMax(res , result.size());
            }else {
                result.sort(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o1.compareTo(o2);
                    }
                });
                max = result.get(result.size() - 3);
            }
        }

        return max;
    }

    private static List<Integer> removeDuplicates(int[] nums , int length) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                list.add(nums[i]);
            }
        }
        return list;
    }

    private static int getMax(Integer[] nums, int length) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < length; i++) {
            if(nums[i] > max)
                max = nums[i];
        }
        return max;
    }
}
