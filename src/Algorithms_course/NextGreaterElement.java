package Algorithms_course;

public class NextGreaterElement {

    public static void main(String[] args) {
        int [] input = new int [] {10 , 11 , 5 , 4 , 7}; // 10-> 11 , 11-> -1 , 5-> 7 , 4->7  , 7-> -1
        findNextGreaterElement(input);
    }

    private static void findNextGreaterElement(int[] input) {

        int length = input.length;
        for (int i = 0; i < length; i++) {
            boolean found = false;
            for (int j = i; j < length; j++) {
                if(input[i] < input[j]){
                    System.out.println(input[i] + "->" + input[j]);
                    found = true;
                    break;
                }
            }
            if (!found)
                System.out.println(input[i] + "->" + "-1");
        }
    }
}
