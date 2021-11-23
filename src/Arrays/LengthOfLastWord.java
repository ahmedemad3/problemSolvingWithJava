package Arrays;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));

    }

    public static int lengthOfLastWord(String s) {
        if(s!= null && s.length() > 1){
            String[] list =s.split("\\s");
            String word=list[list.length - 1];
            return word.length();
        }else
            return 0;
    }
}
