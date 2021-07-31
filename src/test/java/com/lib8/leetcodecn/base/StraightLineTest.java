package com.lib8.leetcodecn.base;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/4/8
 */
class StraightLineTest {

    private StraightLine solution;

    @BeforeEach
    void init() {
        solution = new StraightLine();
    }

    @Test
    void checkStraightLine() {
        assertThat(solution.checkStraightLine(new int[][]{{1, 1}, {2, 2}, {3, 4}})).isFalse();
    }

    //
    @Test
    void checkStraightLine2() {
        assertThat(solution.checkStraightLine(new int[][]{{8,78},{2,18},{-1,-12},{-5,-52},{-4,-42},{-8,-82},{3,28},{9,88}})).isTrue();
    }
}