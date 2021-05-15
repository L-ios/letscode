package com.lib8.leetcodecn.primary.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    ReverseString solution;

    @BeforeEach
    void setUp() {
        solution = new ReverseString();
    }

    @Test
    void reverseString() {
        char[] s = "hello".toCharArray();
        assertThat(reverseString(s)).asString().isEqualTo("olleh");
    }

    char[] reverseString(char... chs) {
        solution.reverseString(chs);
        return chs;
    }
}