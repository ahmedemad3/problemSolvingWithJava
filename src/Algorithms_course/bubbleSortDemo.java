package Algorithms_course;

public class bubbleSortDemo {

    public static void main(String[] args) {
        int[] input = new int[]{3,60,35,2,45,320,5}; // { 2 , 3 , 5 , 35 , 45 , 60 , 320}
        sortWithBubbleSort(input);
    }

    private static void sortWithBubbleSort(int[] input) {

        int length = input.length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length ; j++) {
                if(input[i] < input[j]){
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
        for (int i = 0; i < length; i++) {
            System.out.println(input[i]);
        }


    }
}
