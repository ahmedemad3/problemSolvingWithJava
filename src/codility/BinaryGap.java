package codility;

import java.util.Arrays;
import java.util.stream.Stream;

public class BinaryGap {

    public static void main(String[] args) {
        System.out.println("count : " + solution(1162));
    }

    public static int solution(int N) {
        int count = 0;
        String str= Integer.toBinaryString(N);
        System.out.println(str);
        int index0 =str.indexOf("1");
        if(index0 != -1){
            int lastIndex = str.lastIndexOf("1");
            if(lastIndex == index0)
                count = 0;
            else if(lastIndex != -1){
                String zeros = str.substring(index0+1 , lastIndex);
                System.out.println("zeros : " + zeros);
                if (zeros != null && zeros.contains("1") && zeros.contains("0")) {
                    int index1 = zeros.indexOf("1");
                    System.out.println("index1 : " + index1);
                    if(index1 == zeros.length()-1){
                        count = zeros.substring(0 , index1).length();
                    }else if (index1 < zeros.length()/2){
                        count = zeros.substring(index1 , zeros.length()-1).length();
                    }else{
                        count = zeros.substring(0 , index1).length();
                    }
                } else if(zeros != null && zeros.contains("0")){
                    count = zeros.length();
                }
            }
        }
        return count;
    }
}
