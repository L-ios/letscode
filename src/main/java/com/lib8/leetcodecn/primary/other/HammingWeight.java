package com.lib8.leetcodecn.primary.other;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/4/13
 */
public class HammingWeight {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n >>>= 1;
        }
        return count;
    }
}
