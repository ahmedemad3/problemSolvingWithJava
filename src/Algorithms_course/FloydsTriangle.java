package Algorithms_course;

public class FloydsTriangle {

    public static void main(String[] args) {
        int number = 15;
        drawFloydsTriangle(number);
    }

    private static void drawFloydsTriangle(int number) {
        int numberOfRows = number/2;
        int k = 1;
        for (int i = 1; i <= numberOfRows ; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(k);
                System.out.print("\t");
                k++;
            }
            System.out.print("\n");
        }
    }
}
