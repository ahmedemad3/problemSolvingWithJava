package Algorithms_course;

public class MaxStack {

    public static void main(String[] args) {
        DesignStackToFindMax ds = new DesignStackToFindMax();
        ds.push(5);
//        System.out.println(ds.getMaxV2());
        ds.push(2);
//        System.out.println(ds.getMaxV2());
        ds.push(4);
//        System.out.println(ds.getMaxV2());
        ds.push(6);
//        System.out.println(ds.getMaxV2());
        ds.push(8);
//        System.out.println(ds.getMaxV2());
//        ds.pop();
//        System.out.println(ds.getMaxV2());
        ds.pop();
//        System.out.println(ds.getMaxV2());
        ds.pop();
        System.out.println(ds.getMaxV2());


    }


}
