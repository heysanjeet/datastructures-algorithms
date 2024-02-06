package leetcode.feb;

public class PartitionArrayforMaximumSum {
    public static void main(String[] args) {
        /*Input: arr = [1,15,7,9,2,5,10], k = 3
        Output: 84
        Explanation: arr becomes [15,15,15,9,10,10,10]*/
    }

    public int maxSumAfterPartitioning(int[] arr, int k) {
        int length = arr.length;
        int[] dp = new int[k];

        for (int i = 1; i <= length; i++) {
            int currMax = 0;
            int best = 0;
            for (int j = 1; j <= k && i - j >= 0; j++) {
                currMax = Math.max(currMax, arr[i - j]);
                best = Math.max(best, dp[(i - j) % k] + currMax * j);
            }
            dp[i % k] = best;
        }
        return dp[length % k];
    }
}
