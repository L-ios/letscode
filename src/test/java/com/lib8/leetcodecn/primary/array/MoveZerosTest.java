package com.lib8.leetcodecn.primary.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MoveZerosTest {

    private MoveZeros solution;

    @BeforeEach
    void setUp() {
        solution = new MoveZeros();
    }

    @Test
    void zero_start() {
        assertThat(moveZerors(0, 0, 1)).containsSequence(1, 0, 0);
    }

    @Test
    void leetcode_example() {
        assertThat(moveZerors(0, 1, 0, 3, 12)).containsSequence(1, 3, 12, 0, 0);
    }

    private int[] moveZerors(int... nums) {
        solution.moveZeros(nums);
        return nums;
    }
}