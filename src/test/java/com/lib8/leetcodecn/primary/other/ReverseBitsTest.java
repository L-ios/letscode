package com.lib8.leetcodecn.primary.other;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/5/24
 */
class ReverseBitsTest {
    private ReverseBits solution = new ReverseBits();

    int reverseBits(int n) {
        return solution.reverseBits(n);
    }

    @Test
    void baseTest() {
        assertThat(reverseBits(0b00000010100101000001111010011100)).isEqualTo(964176192);
    }
}