package leetcode.top150.array.easy;

public class BuySellStock11 {
    public static void main(String[] args) {

    }

    //Time O(n) | space O(1)
    public int maxProfit(int[] prices) {
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                profit=profit+(prices[i]-prices[i-1]);
            }
        }
        return profit;
    }
}
