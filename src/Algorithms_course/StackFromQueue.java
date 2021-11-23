package Algorithms_course;

import java.util.LinkedList;
import java.util.Queue;

public class StackFromQueue {

    Queue<Integer> primary = null;
    Queue<Integer> secondary = null;
    public static void main(String[] args) {
        // stack ==> LIFO
        //Queue ==> FIFO

        // p -> 2 -> 1
        // S  -> 1 ->

        // check this link https://www.youtube.com/watch?v=Qk7obcDReHE&list=PLNmW52ef0uwsjnM06LweaYEZr-wjPKBnj&index=21

    }

    StackFromQueue(){
        primary = new LinkedList<>();
        secondary = new LinkedList<>();
    }

    public void push(int x){
        secondary.add(x);
        while (!primary.isEmpty()){
            secondary.add(primary.remove());
        }
        Queue<Integer> temp = primary;
        primary = secondary;
        secondary = temp;
    }

    public int pop(){
        if(primary.isEmpty()) throw new IndexOutOfBoundsException();
        return primary.remove();
    }


}
