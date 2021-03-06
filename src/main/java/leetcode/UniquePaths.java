package leetcode;

/**
 * LeetCode Solution No.0062.
 *
 * @see <a href="UniquePaths"> https://leetcode.com/problems/unique-paths </a>
 * @author Yifan Gu
 */

public class UniquePaths {
  public static int uniquePaths(int m, int n) {
    int[][] dp = new int[n + 1][m + 1];
    dp[1][0] = 1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= m; j++) {
        dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
      }
    }
    return dp[n][m];
  }
}
