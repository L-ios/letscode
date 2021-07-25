package com.lib8.leetcodecn;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/6/3
 */
class SubArraySumTest {

    private SubArraySum solution = new SubArraySum();

    @Test
    void subArraySum() {
        assertThat(solution.subArraySum(new int[]{1, 1, 1}, 2)).isEqualTo(2);
        assertThat(solution.subArraySum(new int[]{1, 2, 3}, 3)).isEqualTo(2);
        assertThat(solution.subArraySum(new int[]{-1, -1, 1}, 0)).isEqualTo(1);
        assertThat(solution.subArraySum(new int[]{1, -1, 0}, 0)).isEqualTo(3);
    }
}