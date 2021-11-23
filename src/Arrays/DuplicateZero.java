package Arrays;

import java.util.Arrays;

public class DuplicateZero {

    public static void main(String[] args) {
        duplicateZeros(new int[]{0,4,1,0,0,8,0,0,3});
    }


    public static void duplicateZeros(int[] arr) {
        int[] copyArray = new int[arr.length];
        copy(copyArray, arr);
        int shiftNUmber = 0;
        for (int i = 0; i < copyArray.length; i++) {
            if(copyArray[i] == 0 ){
                shiftNUmber = copyArray[i];
                shiftArray(arr , i+1 , shiftNUmber);
            }

        }

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" , ");
        }

    }

    public static void shiftArray(int[] arr, int index, int shiftNUmber){
        if(index < arr.length-1){
            int temp = arr[index];
            int temp2 = 0;
            arr [index] = shiftNUmber;
            for (int i = index + 1; i < arr.length; i++) {
                if(i+1 < arr.length)
                    temp2 = arr[i];
                arr[i] = temp;
                temp = temp2;
            }
        }
    }

    public static void copy(int[] copyArray, int[] arr){
        for(int i=0 ; i < arr.length; i++){
            copyArray[i] = arr[i];
        }
    }

}
