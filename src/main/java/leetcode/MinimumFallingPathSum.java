package leetcode;

/**
 * LeetCode Solution No.0931.
 *
 * @see <a href="MinimumFallingPathSum"> https://leetcode.com/problems/minimum-falling-path-sum </a>
 * @author Yifan Gu
 */

public class MinimumFallingPathSum {
  public static int minFallingPathSum(int[][] A) {
    int[][] dp = new int[A.length][A[0].length + 2];
    for (int i = 1; i <= A[0].length; i++) {
      dp[0][i] = A[0][i - 1];
    }
    for (int i = 0; i < A.length; i++) {
      dp[i][0] = Integer.MAX_VALUE;
      dp[i][A[0].length + 1] = Integer.MAX_VALUE;
    }
    for (int i = 1; i < A.length; i++) {
      for (int j = 1; j <= A[0].length; j++) {
        int can = Math.min(dp[i - 1][j - 1], dp[i - 1][j]);
        can = Math.min(can, dp[i - 1][j + 1]);
        dp[i][j] = A[i][j - 1] + can;
      }
    }
    int min = Integer.MAX_VALUE;
    for (int i = 1; i <= A[0].length; i++) {
      min = Math.min(min, dp[A.length - 1][i]);
    }
    return min;
  }
}
