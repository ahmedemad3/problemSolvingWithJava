package Arrays;

public class SortArrayByParity {

    public static void main(String[] args) {
        sortArrayByParity(new int[]{3,1,2,4});
    }


    public static int[] sortArrayByParity(int[] nums) {

        int length = nums.length;
        int position = 0;
        for (int i = 0; i < length; i++) {
            if(nums[i] % 2 !=0){
                continue;
            }else {
                int temp = nums[position];
                nums[position] = nums[i];
                nums[i] = temp;
                position++;
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.println(nums[i]);
        }

        return nums;
    }
}
