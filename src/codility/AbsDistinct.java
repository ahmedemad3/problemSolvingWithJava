package codility;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class AbsDistinct {
    /**
     A non-empty array A consisting of N numbers is given. The array is sorted in non-decreasing order. The absolute distinct count of this array is the number of distinct absolute values among the elements of the array.
     For example, consider array A such that:
     A[0] = -5
     A[1] = -3
     A[2] = -1
     A[3] =  0
     A[4] =  3
     A[5] =  6
     The absolute distinct count of this array is 5, because there are 5 distinct absolute values among the elements of this array, namely 0, 1, 3, 5 and 6.
     Write a function:
     class Solution { public int solution(int[] A); }
     that, given a non-empty array A consisting of N numbers, returns absolute distinct count of array A.
     For example, given array A such that:
     A[0] = -5
     A[1] = -3
     A[2] = -1
     A[3] =  0
     A[4] =  3
     A[5] =  6
     the function should return 5, as explained above.
     Write an efficient algorithm for the following assumptions:
     N is an integer within the range [1..100,000];
     each element of array A is an integer within the range [−2,147,483,648..2,147,483,647];
     array A is sorted in non-decreasing order.
     */

    public static void main(String[] args) {
        int[] A = { -5, -3, -1, 0, 3, 5 };
        System.out.println(solution(A));
    }

//    public static int solution(int[] A) {
//        return (int) IntStream.of(A).map(Math::abs).distinct().count();
//    }

    public static int solution(int[] A) {
        for (int i = 0; i < A.length; i++) {
            if(A[i] < 0)
                A[i] = A[i] * -1;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
                set.add(A[i]);
        }
        return set.size();
    }
}
