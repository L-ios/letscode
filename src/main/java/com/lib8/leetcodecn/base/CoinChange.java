package com.lib8.leetcodecn.base;

import java.util.HashMap;
import java.util.Map;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/5/20
 */
public class CoinChange {
    public static int coinChange(int amount, int... coins) {
        int[] dp = new int[amount+1];
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            dp[i] = amount+1;
            for (int coin : coins) {
                if (i < coin) {
                    continue;
                }
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
