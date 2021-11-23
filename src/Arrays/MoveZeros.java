package Arrays;

public class MoveZeros {

    public static void main(String[] args) {
        moveZeroes(new int[]{4,2,4,0,0,3,0,5,1,0});
    }

    public static void moveZeroes(int[] nums) {

        int length = nums.length;
        int position = 0;
        for(int i= 0 ; i < length ; i ++){
            if(i+1 < length){
                if(nums[i] == 0 && nums[i] != nums[i+1]){
                    nums[position] = nums[i+1];
                    nums[i+1] = 0;
                    position++;
                }else if(nums[i] == 0 && nums[i] == nums[i+1]){
                    if(i+2 < length && nums[i+2] !=0){
                        nums[position] = nums[i+2];
                        nums[i+2] = 0;
                        position++;
                    }
                }else{
                    position++;
                }
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.println(nums[i]);
        }
    }
}
