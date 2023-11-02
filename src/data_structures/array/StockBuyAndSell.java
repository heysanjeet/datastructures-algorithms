package data_structures.array;

public class StockBuyAndSell {
    /* Input: arr[] = {100, 180, 260, 310, 40, 535, 695}
     Output: 865
     Explanation: Buy the stock on day 0 and sell it on day 3 => 310 – 100 = 210
     Buy the stock on day 4 and sell it on day 6 => 695 – 40 = 655
     Maximum Profit  = 210 + 655 = 865*/
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
//        System.out.println(maxProfit(arr, 0, arr.length - 1));
        System.out.println(maxProfitEfficient(arr));
    }

    /* Time Complexity: O(n2), Trying to buy every stock and exploring all possibilities.
     Auxiliary Space: O(1)*/
    public static int maxProfit(int[] price, int start, int end) {
        if (end <= start) {
            return 0;
        }
        int profit = 0;
        for (int i = start; i < end; i++) {
            for (int j = i + 1; j <= end; j++) {
                if (price[j] > price[i]) {
                    int currentProfilt = price[j] - price[i] + maxProfit(price, start, i - 1) +
                            maxProfit(price, j + 1, end);
                    profit = Math.max(profit, currentProfilt);
                }
            }
        }
        return profit;
    }

    /*Time Complexity: O(n), Traversing over the array of size n
    Auxiliary Space: O(1)*/
    public static int maxProfitEfficient(int[] price) {
        int profit = 0;
        for (int i = 1; i < price.length; i++) {
            if (price[i] > price[i - 1]) {
                profit = profit + (price[i] - price[i - 1]);
            }
        }
        return profit;
    }
}
