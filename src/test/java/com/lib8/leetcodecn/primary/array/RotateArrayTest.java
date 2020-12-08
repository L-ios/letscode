package com.lib8.leetcodecn.primary.array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.InstanceOfAssertFactories.ARRAY;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2020/12/9
 */
class RotateArrayTest {

    private RotateArray solution;

    @BeforeEach
    void setUp() {
        solution = new RotateArray();
    }

    @Test
    void rotate() {
        assertThat(new int[]{5, 6, 7, 1, 2, 3, 4}).containsExactly(rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3));
        assertThat(new int[]{3, 4, 5, 1, 2}).containsExactly(rotate(new int[]{1, 2, 3, 4, 5}, 3));
    }

    private int[] rotate(int[] nums, int k) {
        int[] result = Arrays.copyOf(nums, nums.length);
        solution.rotate(result, k);
        return result;
    }

}