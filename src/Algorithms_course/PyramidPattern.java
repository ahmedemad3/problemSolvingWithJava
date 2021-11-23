package Algorithms_course;

public class PyramidPattern {

    public static void main(String[] args) {
        int number = 5;
        drawPyramidPattern(number);
    }

    private static void drawPyramidPattern(int number) {

        for (int i = 0; i < number; i++) {
            for (int j = 1; j <= number-i ; j++) {
                System.out.print(j);
                System.out.print("\t");
            }
            System.out.print("\n");
        }
    }
}
