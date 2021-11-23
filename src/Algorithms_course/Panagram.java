package Algorithms_course;

import java.util.Locale;

public class Panagram {

    // write java program to check if string is panagram or not and that mean that if you have
    // a string contains a and z in the same word is panagram

    public static void main(String[] args) {
        String sentence = "the quick crown fox jumps lazy dog";
        System.out.println(isPanagram(sentence.toLowerCase()));
    }

    private static boolean isPanagram(String sentence) {

        // is char 'a' or 'z' available in string

//        if(sentence.indexOf('a') > 0  && sentence.indexOf('z') > 0)
//            return true;
        boolean exist = false;
        if(sentence.length() < 26){
            return false;
        }else{

            for (char ch = 'a' ; ch <= 'z'; ch++){
//                System.out.println("ch is  : " + ch);
                if(sentence.indexOf(ch) > 0 ){
//                    System.out.println("sentence.indexOf(ch) : " + sentence.indexOf(ch));
                    exist = true;
                }
            }
        }
        return exist;
    }
}
