package com.lib8.leetcodecn;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/5/30
 */
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        return (n > 0) && ((n & (n-1))== 0);
    }
}
