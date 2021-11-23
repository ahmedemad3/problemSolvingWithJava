package Arrays;

public class DuplicateZeroV2 {

    public static void main(String[] args) {
        duplicateZeros(new int[]{0,0,0,0,0,0,0}); // [0,0,0,0,0,0,0] [1,0,2,3,0,4,5,0]
    }


    public static void duplicateZeros(int[] arr) {
        int length = arr.length;
        int[] copyArray = new int[arr.length];
        int j = 0;
        for (int i = 0; i <length ; i++) {
            if(j < length){
                int value = arr[i];
                if(value == 0){
                    if(i+1 < length){
                        if(j > i){
                            copyArray[j] = arr[i];
                            if(j + 1 < length)
                                copyArray[j+1] = 0;
                            j = j + 2;
                        }else {
                            copyArray[i] = arr[i];
                            copyArray[i+1] = 0;
                            j = i + 2;
                        }
                    }
                }else{
                    if(j > i)
                        copyArray[j] = arr[i];
                    else
                        copyArray[i] = arr[i];
                    j++;
                }
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.println(copyArray[i]);
        }
    }
}
