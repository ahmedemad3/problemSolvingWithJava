package Algorithms_course;

public class StockBuySellMaxProfit {

    /**
     * Given an array of integers representing stock price on a single day, find max profit that can be earned by 1 transaction.
     * So you need to find a pair (buyDay,sellDay) where buyDay < = sellDay and it should maximize the profit. For example:
     * int arr[]={14, 12, 70, 15, 99, 65, 21, 90};
     * Max profit can be gain by buying on 1st day(0 based indexing) and sell on the 4th day.
     * Max profit = 99-12 =87
     * @param args
     */

    public static void main(String[] args) {
        int arr[]={14, 5, 70, 15, 99, 65, 21, 90};
        System.out.println(getStockBuySellMaxProfit(arr));
    }

    private static int getStockBuySellMaxProfit(int[] arr) {
        int maxProfit = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            if(arr[i] > max)
                max = arr[i];
        }
        maxProfit = max-min;
        return maxProfit;
    }
}
