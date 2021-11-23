package Algorithms_course;

import java.util.ArrayList;
import java.util.List;

public class BaseballSoluation {

    public static void main(String[] args) {
//        String [] ops = {"5" , "2" , "C" , "D" , "+"};
        String [] ops = {"5" , "-2" , "4" , "C" , "D" , "9", "+", "+"};
        calculateAllOps(ops);
    }

    private static int calculateAllOps(String[] ops) {
        int length = ops.length;
        int result = 0;
        List<Integer> recordList = new ArrayList<>();
        for (int i = 0; i <length ; i++) {
            addRecordToList(ops[i] , recordList);
        }

        for (Integer record : recordList){
            System.out.println(record);
        }
        result = recordList.stream().reduce(0 , (a , b)-> a+b);
        System.out.println("Sum  = " + result);
        return result;
    }

    private static void addRecordToList(String op, List<Integer> recordList) {
        int lastIndex = recordList.size()-1;
        int record = 0;
        if(op.equalsIgnoreCase("c")){
            recordList.remove(lastIndex);
        } else if (op.equalsIgnoreCase("d")){
            record = 2* (recordList.get(lastIndex));
            recordList.add(record);
        } else if (op.equalsIgnoreCase("+")){
            record = (recordList.get(lastIndex)) + (recordList.get(lastIndex-1));
            recordList.add(record);
        }else {
            record = Integer.parseInt(op);
            recordList.add(record);
        }
    }




}
