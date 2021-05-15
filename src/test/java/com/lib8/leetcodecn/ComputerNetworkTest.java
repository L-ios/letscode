package com.lib8.leetcodecn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ComputerNetworkTest {

    ComputerNetwork solution;

    @BeforeEach
    void setUp() {
        solution = new ComputerNetwork();
    }

    @Test
    void two_cycle_return_1() {
        int reConnect = solution.makeConnected2(6, new int[][]{
                {0, 1}, {1, 2}, {2, 0},
                {3, 4}, {4, 5}, {5, 3}
        });

        assertThat(reConnect).isEqualTo(1);
    }
}