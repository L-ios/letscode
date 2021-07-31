package com.lib8.leetcodecn.primary.dynamic;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/5/19
 */
class MaxProfitTest {


    int maxProfit(int... prices) {
        return MaxProfit.maxProfit(prices);
    }

    @Test
    void simple() {
        assertThat(maxProfit(7, 1, 3, 5, 6, 4)).isEqualTo(5);
    }

    @Test
    void down() {
        assertThat(maxProfit(7, 6, 5, 4, 3, 2, 1)).isEqualTo(0);
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