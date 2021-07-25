package com.lib8.leetcodecn.primary2.array;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/6/8
 */
public class MaxProfit2 {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        int profitCount = 0;
        for (int i = 1; i < prices.length; i++) {
            int price = prices[i];
            if (profit > price - min) {
                profitCount += profit;
                profit = 0;
                min = price;
            } else {
                min = Math.min(min, price);
                profit = Math.max(profit, price - min);
            }
        }
        return profitCount+profit;
    }
}
