package com.lib8.leetcodecn.base;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/4/6
 */
class DuplicatesSortedArrayTest {

    private DuplicatesSortedArray solution;

    @BeforeEach
    public void init() {
        solution = new DuplicatesSortedArray();
    }

    @Test
    void leetcode_e1() {
        assertThat(removeDuplicates(1, 1, 1, 2, 2, 3, 3, 3)).isEqualTo(6);
    }


    @Test
    void middle_duplicate() {
        assertThat(removeDuplicates(1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3)).isEqualTo(6);
    }



    private int removeDuplicates(int... nums) {
        return solution.removeDuplicates(nums);
    }
}