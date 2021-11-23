package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Duplicate {

    public static void main(String[] args) {
        System.out.println(removeDuplicates_3(new int [] {0,0,1,1,1,2,2,3,3,4}));
    }

    public static int removeDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(list.size() > 0) {
                if(list.indexOf(nums[i]) == -1)
                    list.add(nums[i]);
            } else {
                list.add(nums[i]);
            }
        }
        System.out.println("list : " + list);

        return list.size();
    }

    public static int removeDuplicates_2(int[] nums) {
        if(nums.length ==0) return 0;
        int current = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == current)
                continue;
            else{
                count ++;
                current = nums[i];
            }
        }
       return count;
    }


    public static int removeDuplicates_3(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
