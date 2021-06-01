package com.lib8.leetcodecn.primary.math;

import java.util.ArrayList;
import java.util.List;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/5/20
 */
public class CountPrimes {
    public static int countPrimes(int n) {
        boolean[] dp = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!dp[i]) {
                System.out.println(i);
                count++;
                for (int j = i; j < n; j+=i) {
                    dp[j] = true;
                }
            }
        }
        return count;
    }
}
