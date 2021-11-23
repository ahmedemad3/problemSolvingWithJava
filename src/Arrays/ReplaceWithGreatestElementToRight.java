package Arrays;

public class ReplaceWithGreatestElementToRight {

    public static void main(String[] args) {
        replaceElements(new int[]{17,18,5,4,6,1});
//        shiftArray(0 , 6 , new int[]{17,18,5,4,6,1});
    }

    public static int[] replaceElements(int[] arr) {
        int length = arr.length;
        int[] result = new int[arr.length];
        if(length == 1)
            return new int[]{-1};
        else{
            // for loop through the array and get the rest of array and for loop to get the max
            for (int i = 0; i < length; i++) {
                if(i+1 < length){
                    int index = getTheGreatestElement(i+1 , length , arr);
                    result[i] = arr[index];
//                    shiftArray(i+1 , length , arr);
                }else{
                    result[i] = -1;
                }

            }
        }

        for (int i = 0; i < length; i++) {
            System.out.println(result[i]);
        }
        return arr;
    }

    private static void shiftArray(int start, int length, int[] arr) {
        for (int i = start ; i < length; i++) {
            if(i+1 < length)
                arr[i] = arr[i+1];
        }
        arr[length-1] = -1;

//        for (int i = start; i < length; i++) {
//            System.out.println(arr[i]);
//        }
    }

    private static int getTheGreatestElement(int start, int length, int[] arr) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = start; i < length; i++) {
            if(arr[i] > max){
                index = i;
                max = arr[i];
            }

        }
        return index;
    }
}
