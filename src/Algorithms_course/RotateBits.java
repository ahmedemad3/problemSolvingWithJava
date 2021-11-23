package Algorithms_course;

public class RotateBits {

    public static void main(String[] args) {
        int number = 10;
        int distance = 2;
        System.out.println("Rotate To Right : " +doRotateBitsToRight(number , distance));
        System.out.println("Rotate To Left : " + doRotateBitsToLeft(number , distance));
    }

    private static int doRotateBitsToLeft(int number, int distance) {
        return Integer.rotateLeft(number , distance);
    }

    private static int doRotateBitsToRight(int number, int distance) {
        return Integer.rotateLeft(number , distance);
    }
}
