package com.lib8.leetcodecn.primary.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2020/12/8
 */
class ShareBestBuyTest {

    private ShareBestBuy solution;

    @BeforeEach
    void setUp() {
        solution = new ShareBestBuy();
    }

    @Test
    void maxProfit() {
        assertThat(4).isEqualTo(solution.maxProfit(new int[]{1, 2, 3, 5}));
        assertThat(0).isEqualTo(solution.maxProfit(new int[]{4, 2, 1, 0}));
        assertThat(6).isEqualTo(solution.maxProfit(new int[]{4, 2, 1, 0, 5, 6}));
        assertThat(0).isEqualTo(solution.maxProfit(new int[]{4, 2, 1, 0, 0, 0}));
        assertThat(15).isEqualTo(solution.maxProfit(new int[]{4, 2, 1, 0, 8, 3, 7, 2, 5}));
    }
}