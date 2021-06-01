package com.lib8.leetcodecn.primary.dynamic;

import java.util.Arrays;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/5/20
 */
public class MaxSubArray {
    public int maxSubArray(int... nums) {
        int[] dp = Arrays.copyOf(nums, nums.length);
        int max = dp[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i], dp[i - 1] + dp[i]);
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
