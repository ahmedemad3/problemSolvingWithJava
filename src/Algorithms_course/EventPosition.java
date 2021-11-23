package Algorithms_course;

public class EventPosition {

    /**
     * print elements in even position
     * @param args
     */
    public static void main(String[] args) {
        int [] arr ={10 , 20 , 30 , 40 , 15};
        printEventPosition(arr);
    }

    private static void printEventPosition(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
                if(i % 2 == 0)
                    System.out.println(arr[i]);
        }
    }
}
