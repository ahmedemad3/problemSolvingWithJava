package codility;

public class Solution {

    public static void main(String[] args) {

        System.out.println(solution("ACAXD"));
        /**
         * A , C, A , X , AC , ACA , ACAX , CA , 3 , 4
         */

    }


    public static int solution(String S) {
        int sum = 0;
        String upperStr = S.toUpperCase();
        int length = upperStr.length();
        for(int i = 0; i < length; i++) {
            for (int j = 0; j < length - i; j++) {
                int count = calculateUnique(upperStr.substring(j, j + i + 1));
                sum = sum + count;
            }
//          char ch = upperStr.charAt(i);
//          System.out.println("Sub String : " + ch + "  ===== " + upperStr.substring(0 , i+1));
//          int count  = calculateUniqueV2(upperStr.substring(0 , i+1));
//          sum = sum + count;
        }
        return sum;
    }

    private static int calculateUniqueV2(String str) {

        String temp = "";
        int count = 0;
        for(int i=0 ; i < str.length() ; i++){
            if(temp.indexOf(str.charAt(i)) == -1 ){
                temp = temp + str.charAt(i);
                count ++;
            }else{
                count --;
            }
        }
        System.out.println("count : " + count + "  ==== No of Possible : " + count * str.length());
        return (count * str.length());
    }

    public static int calculateUnique(String str){

        String temp = "";
        int count = 0;
        for(int i=0 ; i < str.length() ; i++){
            if(temp.indexOf(str.charAt(i)) == -1 ){
                temp = temp + str.charAt(i);
                count ++;
            }else{
                count --;
            }
        }
        System.out.println( "str : " + str +  " ==== temp : " + temp + " , length : " + count);
        return count;
    }


}
