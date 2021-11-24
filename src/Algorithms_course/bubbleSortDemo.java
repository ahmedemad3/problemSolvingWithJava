package Algorithms_course;

public class bubbleSortDemo {

    // time Complexity O(n2) space Complexity O(1)
    public static void main(String[] args) {
        int[] input = new int[]{3,60,35,2,45,320,5}; // { 2 , 3 , 5 , 35 , 45 , 60 , 320}
        sortWithBubbleSort(input);
    }

    private static void sortWithBubbleSort(int[] input) {

        // time Complexity is O(N) space is O(n)

        int length = input.length;

        // sorting Ascending
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
