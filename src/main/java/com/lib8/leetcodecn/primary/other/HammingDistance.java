package com.lib8.leetcodecn.primary.other;

import java.util.function.Predicate;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/5/24
 */
public class HammingDistance {
    public int hammingDistance(int x, int y) {
        return (int) Integer.toBinaryString(x ^ y)
                .chars().filter(c -> c == '1').count();
    }
}
