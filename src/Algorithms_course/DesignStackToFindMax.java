package Algorithms_course;

import java.util.*;

public class DesignStackToFindMax {

    Stack<Integer> stack;
    Integer max = null;
//    Integer prevMax = null;
    SortedMap<Integer , Integer> oldMaxMap = new TreeMap<>();  // current number , prevMax

    DesignStackToFindMax(){
        stack = new Stack<>();
        max = Integer.MIN_VALUE;
    }


    public void push(Integer num){
        stack.push(num);
        if(stack.size() == 1)
            oldMaxMap.put(num , num);
        else
            oldMaxMap.put(num , max);
    }

    public Integer pop(){
        Integer val = stack.pop();
        if(oldMaxMap.containsKey(val))
            oldMaxMap.remove(val);
        return val;
    }

    // change to map [number , old Max] getMaxV2
    public Integer getMaxV2(){
        if(stack.isEmpty()) return 0;
        else {
            Integer val =stack.peek();
            Integer lastKey = oldMaxMap.lastKey();
            if(val > oldMaxMap.get(lastKey))
                max = val;
            else
                max = oldMaxMap.get(lastKey);
        }
        return max;
    }
}
