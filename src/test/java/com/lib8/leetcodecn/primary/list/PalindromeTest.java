package com.lib8.leetcodecn.primary.list;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/2/6
 */
class PalindromeTest {

    Palindrome solution;

    @BeforeEach
    void setUp() {
        solution = new Palindrome();
    }

    @Test
    void palindrome_one_node_return_true() {
        assertThat(isPalindrome(1)).isTrue();
    }

    @Test
    void even_node_return_true() {
        assertThat(isPalindrome(1, 2, 2, 1)).isTrue();
    }

    @Test
    void odd_node_return_true() {
        assertThat(isPalindrome(1, 2, 1)).isTrue();
        assertThat(isPalindrome(1, 2, 2, 2, 2, 2, 1)).isTrue();
    }

    private boolean isPalindrome(int... nums) {
        ListNode head = initList(nums);
        return solution.isPalindrome(head);
    }

    private ListNode initList(int... nums) {
        ListNode head = null;
        for (int i = nums.length - 1; i >= 0; i--) {
            head = new ListNode(nums[i], head);
        }

        return head;
    }
}