package Arrays;

public class RemoveElement {

    public static void main(String[] args) {
//        System.out.println();
        removeElement(new int[]{2,2,3} , 2);
    }

    public static int removeElement(int[] nums, int val) {

        int length= 0;
        int[] copyArr = new int[nums.length];
        copy(nums , copyArr);
        for(int i=0; i< copyArr.length; i++){
            if(copyArr[i]==val){
              shiftArray(i-length , nums);
              length++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        return (nums.length)-length;
    }

    public static void shiftArray(int index, int[] nums) {
        for (int i = index; i < nums.length; i++) {
            if(i+1 < nums.length)
                nums[i] = nums[i+1];
            //nums[nums.length-1] = 0;
        }
    }

    private static void copy(int[] nums, int[] copyArr) {
        for (int i = 0; i < nums.length; i++) {
            copyArr[i] = nums[i];
        }
    }


}
