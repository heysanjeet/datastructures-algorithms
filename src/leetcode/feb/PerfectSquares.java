package leetcode.feb;

public class PerfectSquares {
    public static void main(String[] args) {
       /* Input: n = 12
        Output: 3
        Explanation: 12 = 4 + 4 + 4.*//* Input: n = 12
        Output: 3
        Explanation: 12 = 4 + 4 + 4.*/
    }

    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            int min = Integer.MAX_VALUE;

            for (int j = 1; j * j <= i; j++) {
                int rem = i - j * j;
                if (dp[rem] < min) {
                    min = dp[rem];
                }
            }
            dp[i] = min + 1;
        }
        return dp[n];
    }
}
