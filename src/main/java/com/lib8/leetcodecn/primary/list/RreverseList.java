package com.lib8.leetcodecn.primary.list;

public class RreverseList {
    public ListNode reverseList(ListNode head) {
        ListNode result = null;
        while (head != null) {
            ListNode node = head;
            head = head.next;
            node.next = result;
            result = node;
        }
        return result;
    }
}
