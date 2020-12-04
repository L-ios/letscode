package com.lib8.leetcodecn.primary.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2020/12/5
 */
class DeleteDuplicateTest {

    private DeleteDuplicate solution;

    @BeforeEach
    void setUp() {
        solution = new DeleteDuplicate();
    }

    @Test
    void removeDuplicates() {
        assertThat(solution.removeDuplicates(new int[]{1, 1, 2})).isEqualTo(2);
    }
}