package Arrays;

public class RectangleOverlap {
    public static void main(String[] args) {
        int[] rec1 = new int[]{0,10,10,0};
        int[] rec2 = new int[]{5,5,15,0};
        System.out.println(isRectangleOverlap(rec1 , rec2));
    }


    public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        if(rec1.length < 4 || rec2.length < 4)
            return false;
        else{
            if(rec1[0]+ rec1[2] > rec2[0])
                return true;
        }
        return false;
    }
}
