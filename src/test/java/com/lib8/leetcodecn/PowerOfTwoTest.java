package com.lib8.leetcodecn;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/5/30
 */
class PowerOfTwoTest {

    @Test
    void isPowerOfTwo() {
        assertThat(new PowerOfTwo().isPowerOfTwo(8)).isTrue();
        assertThat(new PowerOfTwo().isPowerOfTwo(7)).isFalse();
    }
}