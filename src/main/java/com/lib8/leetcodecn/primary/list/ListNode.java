package com.lib8.leetcodecn.primary.list;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/2/5
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
