package Algorithms_course;

public class CheckYearLeap {

    public static void main(String[] args) {

        int year = 2001;
        isYearLeap(year);
    }

    private static void isYearLeap(int year) {

        // time complexity is O(1) space is O(1)

        if(year % 4 == 0)
            System.out.println("year is leap");
        else
            System.out.println("year is not  leap");
    }
}
