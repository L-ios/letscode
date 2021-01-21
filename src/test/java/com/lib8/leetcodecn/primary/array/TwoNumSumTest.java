package com.lib8.leetcodecn.primary.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TwoNumSumTest {

    private TwoNumSum solution;

    @BeforeEach
    void setUp() {
        solution = new TwoNumSum();
    }

    @Test
    void sequence_twosum() {
        assertThat(twoSum(9, 2, 7, 11, 15)).contains(0, 1);
    }

    @Test
    void not_sequence_twosum() {
        assertThat(twoSum(6, 3, 2, 4)).contains(2, 1);
    }

    @Test
    void two_num() {
        assertThat(twoSum(6, 3, 3)).contains(0, 1);
    }

    int[] twoSum(int target, int... array) {
        return solution.twoSum(array, target);
    }
}