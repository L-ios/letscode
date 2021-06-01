package com.lib8.leetcodecn.primary.array;

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
class IntersectionArrayTest {

    private IntersectionArray solution;

    @BeforeEach
    void setUp() {
        solution = new IntersectionArray();
    }


    @Test
    void intersect() {
        assertThat(new int[]{4, 9}).containsOnly(solution.intersect(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}));
    }
}