package Talabat;

import java.util.*;

public class Demo {

    public static void main(String[] args) {
        // i will use stack ==> Lifo

//        String input = "(())((()())())";
//        System.out.println(isValidParentheses(input));
        
        int[] input = new int[]{1,5,0,55,2,0,4,0,88};
        moveZerosToLeftAndMaintainOrder(input);


    }

    /**
     * move Zeros To Left And Maintain Order
     * @param nums
     */
    private static void moveZerosToLeftAndMaintainOrder(int[] nums) {

        int length = nums.length;
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] == 0)
                count++;
        }

        Map<Integer , Integer> map  = new HashMap<>();
        int position = 0;
        for (int i = 0; i < length; i++) {
            if(nums[i] != 0 ){
                map.put(nums[i] , position + count);
                position++;
            }
        }

        Arrays.sort(nums);
        map.forEach((value, index) -> {
            nums[index] = value;
        });


        for (int i = 0; i < length; i++) {
            System.out.println(nums[i]);
        }

    }

    /**
     * validate the Parentheses is well formed
     * @param input
     * @return
     */
    private static boolean isValidParentheses(String input) {


        if(input.length() == 0)
            return false;
        if(input.length() > 100)
            return false;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if(stack.isEmpty())
                stack.push(ch);
            else if(ch == '(')
                stack.push(ch);
            else if(ch==')' && stack.peek() == '(')
                stack.pop();
        }
        if(stack.isEmpty())
            return true;
        else
            return false;
    }

}
