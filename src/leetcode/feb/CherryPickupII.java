package leetcode.feb;

public class CherryPickupII {
    public static void main(String[] args) {
        /*Input: grid = [[3,1,1],[2,5,1],[1,5,5],[2,1,1]]
        Output: 24
        Explanation: Path of robot #1 and #2 are described in color green and blue respectively.
        Cherries taken by Robot #1, (3 + 2 + 5 + 2) = 12.
        Cherries taken by Robot #2, (1 + 5 + 5 + 1) = 12.
        Total of cherries: 12 + 12 = 24.*/
    }

    public int cherryPickup(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        Integer[][][] dp = new Integer[m][n][n];
        return dfs(grid, m, n, 0, 0, n - 1, dp);
    }

    int dfs(int[][] grid, int m, int n, int r, int c1, int c2, Integer[][][] dp) {
        if (r == m) return 0; // Reach to bottom row
        if (dp[r][c1][c2] != null) return dp[r][c1][c2];
        int ans = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int nc1 = c1 + i, nc2 = c2 + j;
                if (nc1 >= 0 && nc1 < n && nc2 >= 0 && nc2 < n) {
                    ans = Math.max(ans, dfs(grid, m, n, r + 1, nc1, nc2, dp));
                }
            }
        }
        int cherries = c1 == c2 ? grid[r][c1] : grid[r][c1] + grid[r][c2];
        return dp[r][c1][c2] = ans + cherries;
    }
}
