package Arrays;

import com.sun.corba.se.impl.ior.ObjectAdapterIdNumber;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

    public static void main(String[] args) {

//        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));

        System.out.println(removeDuplicatesV2(new int[]{-1,0,0,0,0,3,3}));

    }

    private static int removeDuplicatesV2(int[] nums) {

        int uiniqueCount = 0;
        int length = nums.length;
        int[] result = new int[length];
        int position = 0;
        int lastElement = 00;
        for(int i=0; i < length ; i++){
            if(i+1 < length){
                if(nums[i] == nums[i+1]){
                    if(lastElement != nums[i]){
                        uiniqueCount ++;
                        result[position] = nums[i];
                        lastElement = nums[i];
                        position ++;
                    }
                }else{
                    if(lastElement != nums[i]){
                        uiniqueCount ++;
                        result[position] = nums[i];
                        lastElement = nums[i];
                        position ++;
                    }
                }
            } else if(i+1 == length){
                if(lastElement != nums[i]){
                    uiniqueCount ++;
                    result[position] = nums[i];
                    position++;
                    lastElement = nums[i];
                }
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.println(" === " + result[i]);
        }
        return uiniqueCount;
    }

//    public static int removeDuplicates(int[] nums) {
//        int[] copyArr = new int[nums.length];
//        Set<Integer> set = new LinkedHashSet<>();
//        copy(nums , copyArr , set);
//        int count = 0;
//        int current = copyArr[0];
//        for (int i = 0; i < copyArr.length; i++) {
//            int val = copyArr[i];
//            if(val != current) {
//                count = 0;
//                current = val;
//            }
//            if(!set.add(val)){
//                count++;
//                if(count >1){
//                    removeFromArray(nums , i);
//
//                }
//            }
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
//        return set.size();
//    }

    public static int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        copy(nums , set);
        clearArray(nums);
        int j = 0;
        for (Integer i: set) {
            nums[j++] = i;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        return set.size();
    }

    private static void clearArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
    private static void copy(int[] nums, Set<Integer> set) {
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
    }
}
