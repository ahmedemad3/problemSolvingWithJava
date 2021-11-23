package Algorithms_course;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class DesignStackToFindMax {

    Stack<Integer> stack;
    Integer max = null;
    Integer prevMax = null;
    Map<Integer , Integer> oldMaxMap = new HashMap<>();  // current number , prevMax

    DesignStackToFindMax(){
        stack = new Stack<>();
        max = Integer.MIN_VALUE;
        prevMax = Integer.MIN_VALUE;
    }


    public void push(Integer num){
        stack.push(num);
        if(stack.size() == 1)
            oldMaxMap.put(num , num);
        else
            oldMaxMap.put(num , max);
//        getMax();
        getMaxV2();
    }

    public Integer pop(){
        Integer val = stack.pop();
        if(oldMaxMap.containsKey(val))
            oldMaxMap.remove(val);
//        getMax();
        getMaxV2();
        return val;
    }

    // change to map [number , old Max] getMaxV2
    public Integer getMaxV2(){
        if(stack.isEmpty()) return 0;
        else {
            Integer val =stack.peek();
            max = oldMaxMap.get(val);
        }
        return max;
    }


    public Integer getMax(){
        if(stack.isEmpty()) return 0;
        else if(stack.size() == 1){
            max = stack.peek();
            prevMax = stack.peek();
        } else if(stack.size() == 2){
            Integer topElement= stack.peek();
            Integer first= stack.elementAt(0);
            if(topElement > first) {
                max = topElement;
                prevMax = first;
            }
        } else if(stack.size() > 2){
            Integer topElement = stack.peek();
            if(!stack.contains(max)){
                if(topElement > prevMax ){
                    max = topElement;
                } else {
                    max = Collections.max(stack);
                }
            } else {
                if(max < topElement){
                    prevMax = max;
                    max = topElement;
                }
            }
        }
        return max;
    }

}
