package com.lib8.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

import static com.lib8.leetcode.editor.cn.QLongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class QLongestSubstringWithoutRepeatingCharactersTest {

    @Test
    void lengthOfLongestSubstring_should_return_0_when_empty_str() {
        assertThat(lengthOfLongestSubstring("")).isEqualTo(0);
    }

    @Test
    void lengthOfLongestSubstring_should_return_1_when_blank_str() {
        assertThat(lengthOfLongestSubstring(" ")).isEqualTo(1);
    }

    @Test
    void lengthOfLongestSubstring_should_return_3_when_dvdf() {
        assertThat(lengthOfLongestSubstring("dvdf")).isEqualTo(3);
    }

    @Test
    void lengthOfLongestSubstring_should_return_3_when_pwwkes() {
        assertThat(lengthOfLongestSubstring("pwwkew")).isEqualTo(3);
    }

    @Test
    void lengthOfLongestSubstring_should_return_3_when_abcabcbb() {
        assertThat(lengthOfLongestSubstring("abcabcbb")).isEqualTo(3);
    }
}