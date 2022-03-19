package Algorithms_course;

public class PerfectSquare {

    public static void main(String[] args) {
//        isPerfectSquare(18);
        isPerfectSquareV2(16);
    }

    private static boolean isPerfectSquareV2(int num) {
        for (int j = 1; j < num; j++) {
            if(j*j == num){
                System.out.println("Perfect square");
                return true;
            }
        }
        System.out.println("Not Perfect square");
        return false;
    }

    private static boolean isPerfectSquare(int num) {

        double value = Math.sqrt(num);
        if((value * value) == num){
            System.out.println("Perfect square");
            return true;
        } else{
            System.out.println("Not Perfect square");
            return false;
        }


    }
}
