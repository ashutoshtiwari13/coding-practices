package leetcode;

/**
 * LeetCode Solution No.0309.
 *
 * @see <a href="BestTimeToBuyAndSellStockWithCooldown">
 *      https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown </a>
 * @author Yifan Gu
 */

public class BestTimeToBuyAndSellStockWithCooldown {
  public static int maxProfit(int[] prices) {
    if (prices == null || prices.length <= 1) {
      return 0;
    }
    int[] buy = new int[prices.length + 1];
    int[] sell = new int[prices.length + 1];
    buy[1] = -prices[0];
    for (int i = 2; i <= prices.length; i++) {
      buy[i] = Math.max(buy[i - 1], sell[i - 2] - prices[i - 1]);
      sell[i] = Math.max(sell[i - 1], buy[i - 1] + prices[i - 1]);
    }
    return sell[prices.length];
  }
}
