package com.lib8.leetcodecn.primary.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MyAtoITest {

    private MyAtoI solution;

    @BeforeEach
    public void init() {
        solution = new MyAtoI();
    }


    @Test
    void empty_str_return_zero  () {
        assertThat(solution.myAtoi("")).isEqualTo(0);
    }
    @Test
    void base_str_return_3  () {
        assertThat(solution.myAtoi("3")).isEqualTo(3);
    }

    @Test
    void pre_wisper_return_positive_num() {
        assertThat(solution.myAtoi("  322")).isEqualTo(322);
    }

    @Test
    void pre_wisper_return_negative_num() {
        assertThat(solution.myAtoi("  -322-")).isEqualTo(-322);
        assertThat(solution.myAtoi("  -322")).isEqualTo(-322);
        assertThat(solution.myAtoi("  -42")).isEqualTo(-42);
    }

    @Test
    void integer_min_value() {
        assertThat(solution.myAtoi("-6147483648")).isEqualTo(Integer.MIN_VALUE);
        assertThat(solution.myAtoi("-91283472332")).isEqualTo(Integer.MIN_VALUE);

        assertThat(solution.myAtoi("-2147483648")).isEqualTo(Integer.MIN_VALUE);
        assertThat(solution.myAtoi("-2147483649")).isEqualTo(Integer.MIN_VALUE);
    }

    @Test
    void integer_max_value() {
        assertThat(solution.myAtoi("2147483647")).isEqualTo(Integer.MAX_VALUE);
        assertThat(solution.myAtoi("2147483649")).isEqualTo(Integer.MAX_VALUE);
    }

    @Test
    void pi_test() {
        assertThat(solution.myAtoi("3.1425")).isEqualTo(3);
    }

    @Test
    void set_test() {
        assertThat(solution.myAtoi("4193 with words")).isEqualTo(4193);
    }

    @Test
    void multi_sign() {
        assertThat(solution.myAtoi("-+23")).isEqualTo(0);
        assertThat(solution.myAtoi("+-23")).isEqualTo(0);
    }
    @Test
    void zero_start() {
        assertThat(solution.myAtoi("000-23a12")).isEqualTo(0);
    }
}