package com.lib8.leetcodecn.primary.array;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TwoArrayInterSectionIITest {

    private TwoArrayInterSectionII solution;

    @BeforeEach
    void setUp() {
        solution = new TwoArrayInterSectionII();
    }

    @Test
    void intersect1() {
        assertThat(intersect(array(4, 9, 5), array(9, 4, 9, 8, 4)))
                .contains(4, 9);
    }

    @Test
    void intersect2() {
        assertThat(intersect(array(1, 2, 2, 1), array(2, 2)))
                .contains(2, 2);
    }

    private int[] array(int... num) {
        return num;
    }

    private int[] intersect(int[] nums1, int[] nums2) {
        // return solution.intersect(nums1, nums2);
        return solution.mapIntersect(nums1, nums2);
    }
}