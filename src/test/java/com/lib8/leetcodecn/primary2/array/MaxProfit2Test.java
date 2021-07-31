package com.lib8.leetcodecn.primary2.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/6/8
 */
class MaxProfit2Test {

    int maxProfit(int... prices) {
        return new MaxProfit2().maxProfit(prices);
    }

    @Test
    void simple() {
        assertThat(maxProfit(7, 1, 5, 3, 6, 4)).isEqualTo(7);
    }

    @Test
    void down() {
        assertThat(maxProfit(1, 2, 3, 4, 5)).isEqualTo(4);
    }

    @Test
    void mix() {
        assertThat(maxProfit(3, 2, 6, 5, 0, 3)).isEqualTo(4);
    }

    @Test
    void two_down() {
        assertThat(maxProfit(2, 1)).isEqualTo(0);
    }

}