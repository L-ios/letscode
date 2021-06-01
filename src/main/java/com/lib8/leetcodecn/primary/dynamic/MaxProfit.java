package com.lib8.leetcodecn.primary.dynamic;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/5/19
 */
public class MaxProfit {
    /**
     * 找到最小值，最小值后的每个值与当前值的利润
     * @param prices
     * @return
     */
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }else if (maxProfit < price - minPrice) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
}
