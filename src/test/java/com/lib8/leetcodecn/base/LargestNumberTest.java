package com.lib8.leetcodecn.base;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/4/12
 */
class LargestNumberTest {

    private LargestNumber solution;

    @BeforeEach
    public void init() {
        solution = new LargestNumber();
    }

    @Test
    void largestNumber_2_45_221_3() {
        assertThat(largestNumber(2, 45, 221, 3)).isEqualTo("4532221");
    }

    @Test
    void largestNumber_4_45() {
        assertThat(largestNumber(4, 45)).isEqualTo("454");
    }

    @Test
    void largestNumber_3_5_9() {
        assertThat(largestNumber(3, 5, 9)).isEqualTo("953");
    }

    @Test
    void largestNumber_34323_3432() {
        assertThat(largestNumber(34323, 3432)).isEqualTo("343234323");
    }
    @Test
    void largestNumber_0_0() {
        assertThat(largestNumber(0, 0)).isEqualTo("0");
    }

    String largestNumber(int... nums) {
        return solution.largestNumber(nums);
    }

    @Test
    void when_compare_34323_3432_return_() {
        assertThat(sCompare(3432, 34323)).isPositive();
    }


    @Test
    void when_compare_4_45_return_negative() {
        assertThat(sCompare(4, 45)).isNegative();
    }

    @Test
    void when_compare_4_44_return_zero() {
        assertThat(sCompare(4, 44)).isEqualTo(0);
    }

    @Test
    void when_compare_4_43_return_position() {
        assertThat(sCompare(4, 43)).isPositive();
    }

    int sCompare(int num1, int num2) {
        return solution.compare(String.valueOf(num1), String.valueOf(num2));
    }
}