package com.lib8.leetcodecn.primary.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    Palindrome solution;

    @BeforeEach
    void setUp() {
        solution = new Palindrome();
    }

    @Test
    void isPalindrome() {
        assertThat(solution.isPalindrome("A man, a plan, a canal: Panama")).isTrue();
    }

    @Test
    void isPalindrome1() {
        assertThat(solution.isPalindrome("A.")).isTrue();
    }
    @Test
    void isPalindrome12() {
        assertThat(solution.isPalindrome("Ab")).isFalse();
    }
}