package Arrays;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args) {
        fizzBuzz(15).forEach(s -> System.out.println(s));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<String>();
        if (n == 0)
            return null;
        else{
            for(int i=1 ; i <= n ; i++){
                if((i % 3 == 0) && (i % 5 == 0))
                    list.add("FizzBuzz");
                else if(i % 3 == 0)
                    list.add("Fizz");
                else if(i % 5 == 0)
                    list.add("Buzz");
                else
                    list.add(""+i+"");
            }
        }
        return list;
    }
}
