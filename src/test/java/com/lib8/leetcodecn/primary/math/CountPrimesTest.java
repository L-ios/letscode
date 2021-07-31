package com.lib8.leetcodecn.primary.math;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/5/21
 */
class CountPrimesTest {

    @Test
    void countPrimes() {
//        assertThat(CountPrimes.countPrimes(0)).isEqualTo(0);
//        assertThat(CountPrimes.countPrimes(10)).isEqualTo(4);
        assertThat(CountPrimes.countPrimes(499979)).isEqualTo(5130);

    }
}