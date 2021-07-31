package com.lib8.leetcodecn.primary.math;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/5/23
 */
class RomanToIntTest {

    @Test
    void should_return_1_when_I() {
        assertThat(romanToInt("I")).isEqualTo(1);
    }

    @Test
    void should_return_4_when_IV() {
        assertThat(romanToInt("IV")).isEqualTo(4);
    }
    @Test
    void should_return_9_when_IX() {
        assertThat(romanToInt("IX")).isEqualTo(9);
    }
    @Test
    void should_return_14_when_XIV() {
        assertThat(romanToInt("XIV")).isEqualTo(14);
    }
    @Test
    void should_return_58_when_LVIII() {
        assertThat(romanToInt("LVIII")).isEqualTo(58);
    }
    @Test
    void should_return_49_when_XLIX() {
        assertThat(romanToInt("XLIX")).isEqualTo(49);
    }
    @Test
    void should_return_999_when_CMXCIX() {
        assertThat(romanToInt("CMXCIX")).isEqualTo(999);
    }

    int romanToInt(String s) {
        return RomanToInt.romanToInt(s);
    }
}