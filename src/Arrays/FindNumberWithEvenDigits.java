package Arrays;

public class FindNumberWithEvenDigits {

    public static void main(String[] args) {
        System.out.println(findNumbers(new int[]{555,901,482,1771}));
//        System.out.println(countDigit(100000 , 1));
    }


    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            int countDigit = 1;
            int numberOfDigit = countDigit(value , countDigit);
            if(numberOfDigit %2 == 0)
                count ++;
        }
        return count;
    }

    private static int  countDigit(double value , int count) {
       double result = value / 10;
       if(result >= 1){
           count ++;
           return countDigit(result , count);
       }
        return count;
    }
}
