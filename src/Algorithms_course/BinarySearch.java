package Algorithms_course;

public class BinarySearch {

    public static void main(String[] args) {
        int element = 50;
        int[] input = new int [] {10,20,30,50,70,80,90,100};
        int index = doBinarySearch(element , input , 0 , input.length-1);
        System.out.println(index);
    }

    private static int doBinarySearch(int element, int[] input , int low , int high) {
        if(high >= low){
            int mid= (low + high) / 2;
            if(input[mid] == element)
                return mid;
            else if(element > input[mid]){
                // search element in the right side
                low = mid;
                return doBinarySearch(element , input , low , high);
            } else {
                // search element in the left side
                high = mid;
                return doBinarySearch(element , input , low , high);
            }
        }
        return 0;
    }
}
