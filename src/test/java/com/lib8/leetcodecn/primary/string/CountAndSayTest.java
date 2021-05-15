package com.lib8.leetcodecn.primary.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CountAndSayTest {

    private CountAndSay solution;

    @BeforeEach
    void setUp() {
        solution = new CountAndSay();
    }

    @Test
    void count1() {
        assertThat(countAndSay(1)).isEqualTo("1");
    }

    @Test
    void count2() {
        assertThat(countAndSay(2)).isEqualTo("11");
    }

    @Test
    void count3() {
        assertThat(countAndSay(3)).isEqualTo("21");
    }

    @Test
    void count4() {
        assertThat(countAndSay(4)).isEqualTo("1211");
    }


    @Test
    void count5() {
        assertThat(countAndSay(5)).isEqualTo("111221");
    }

    @Test
    void count6() {
        assertThat(countAndSay(6)).isEqualTo("312211");
    }

    @Test
    void count7() {
        assertThat(countAndSay(7)).isEqualTo("13112221");
    }


    String countAndSay(int n) {
        return solution.countAndSay(n);
    }


}
