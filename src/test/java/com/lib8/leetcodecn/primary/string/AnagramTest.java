package com.lib8.leetcodecn.primary.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    Anagram solution;

    @BeforeEach
    void setUp() {
        solution = new Anagram();
    }

    @Test
    void isAnagram() {
        assertThat(solution.isAnagram("a", "b")).isFalse();
    }
}