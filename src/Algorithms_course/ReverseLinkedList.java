package Algorithms_course;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {

    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        printReverseLinkedList(linkedList);
    }

    private static void printReverseLinkedList(List<Integer> linkedList) {
        Collections.reverse(linkedList);
        linkedList.forEach(integer -> {
            System.out.println(integer);
        });
    }
}
