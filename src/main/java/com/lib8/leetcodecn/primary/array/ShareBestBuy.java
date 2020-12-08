package com.lib8.leetcodecn.primary.array;

/**
 * <a herf="https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2zsx1/">买卖股票的最佳时机 II</a>
 *
 * @author: Lionseun Ling
 * @create: 2020/12/8
 */
public class ShareBestBuy {
    public int maxProfit(int[] prices) {
        int low = prices[0], high = low;
        int sumProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            int price = prices[i];
            if (price > high) {
                high = price;
                continue;
            }
            sumProfit += (high - low);
            low = price;
            high = price;
        }
        sumProfit += (high - low);
        return sumProfit;
    }
}
