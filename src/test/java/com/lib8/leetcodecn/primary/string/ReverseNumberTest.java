package com.lib8.leetcodecn.primary.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ReverseNumberTest {

    private ReverseNumber solution;
    @BeforeEach
    void setUp() {
        solution = new ReverseNumber();
    }

    @Test
    void reverse() {
        assertThat(solution.reverse(1534236469)).isEqualTo(0);

    }

    @Test
    void reverse_negative() {
        assertThat(solution.reverse(-123)).isEqualTo(-321);
    }
}