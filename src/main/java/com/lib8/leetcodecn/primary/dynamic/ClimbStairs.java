package com.lib8.leetcodecn.primary.dynamic;

import java.util.HashMap;
import java.util.Map;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/5/19
 */
public class ClimbStairs {
    public int climbStairs(int n) {
        int[] climbs = new int[n+3];
        climbs[1] = 1;
        climbs[2] = 2;
        for (int i = 3; i <= n; i++) {
            climbs[i] = climbs[i-1] + climbs[i-2];
        }
        return climbs[n];
    }
}
