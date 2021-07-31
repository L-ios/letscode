package com.lib8.leetcodecn.base;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/5/20
 */
class CoinChangeTest {

    @Test
    void coinChange() {
        assertThat(CoinChange.coinChange(2, 1, 2)).isEqualTo(1);
    }
}