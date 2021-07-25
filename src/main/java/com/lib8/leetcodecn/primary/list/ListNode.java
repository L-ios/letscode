package com.lib8.leetcodecn.primary.list;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/2/5
 */
public class ListNode {
    public int val;
    public ListNode next;

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
