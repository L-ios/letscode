package com.lib8.leetcodecn.base;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2020/12/15
 */
class BinarySearchTest {

    private BinarySearch solution;

    @BeforeEach
    void setUp() {
        solution = new BinarySearch();
    }

    @Test
    void search() {
        assertThat(-1).isEqualTo(solution.search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
    }
}