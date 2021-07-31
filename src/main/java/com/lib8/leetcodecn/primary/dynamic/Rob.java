package com.lib8.leetcodecn.primary.dynamic;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/5/23
 */
public class Rob {
    public int rob(int[] nums) {
        // dp table,
        int[] dp = new int[nums.length+1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(dp[i-1], nums[i-1] + dp[i-2]);
        }
        return dp[nums.length];
    }

    public int rob2(int[] nums) {
        int pre = 0;
        int temp;
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            temp = result;
            result = Math.max(result, pre + nums[i]);
            pre = temp;
        }
        return result;
    }
}
