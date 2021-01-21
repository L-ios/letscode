package com.lib8.leetcodecn.primary.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {

    private PlusOne solution;

    @BeforeEach
    void setUp() {
        solution = new PlusOne();
    }

    @Test
    void when_plusOne_then_carry_up() {
        assertThat(plusOne(9, 9, 9)).containsSequence(1, 0, 0, 0);
    }

    @Test
    void when_plus_one_to_one() {
        assertThat(plusOne(0)).containsSequence(1);
    }

    @Test
    void plus_one_to_199_return_200() {
        assertThat(plusOne(1, 9, 9)).containsSequence(2, 0, 0);
    }

    @Test
    void plus_one_to_zero_arr() {
        assertThat(plusOne(0, 0)).containsSequence(0 ,1);
    }

    int[] plusOne(int... digits) {
        return solution.plusOne(digits);
    }
}