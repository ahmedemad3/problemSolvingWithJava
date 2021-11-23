package Crokking_Algorithm.Ch1;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[]{1 , 3, 5, 7 , 9};
        System.out.println(search( arr, 7));
    }

    public static int search(int [] arr , int searchItem){
        int length = arr.length;
        int low = 0;
        int high = length-1;
        while (low <= high){
            int middle = (low + high) / 2;
            if(searchItem == arr[middle])
                return middle;
            else if (searchItem > arr[middle])
                low = middle + 1;
            else if(searchItem < arr[middle])
                high = middle - 1;
        }
        return -1;
    }
}
