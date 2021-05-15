package com.lib8.hwoj.m312;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Solution1Test {

    @Test
    void maxRelease() {
        assertThat(Solution1.maxRelease("..x..x..xx", 2)).isEqualTo(8);
    }
}