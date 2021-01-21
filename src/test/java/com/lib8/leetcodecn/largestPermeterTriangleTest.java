package com.lib8.leetcodecn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LargestPermeterTriangleTest {

    private LargestPermeterTriangle solution;

    @BeforeEach
    void setUp() {
        solution = new LargestPermeterTriangle();
    }

    @Test
    void can_not_be_triangle() {
        assertThat(largestPermeter(1, 2, 1)).isEqualTo(0);
    }



    private int largestPermeter(int... nums) {
        return solution.largestPermeter(nums);
    }
}