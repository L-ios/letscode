package com.lib8.leetcodecn.primary.other;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/5/24
 */
public class ReverseBits {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = (result << 1) | (n & 1);
            n = n >>> 1;
        }
        return result;
    }
}
