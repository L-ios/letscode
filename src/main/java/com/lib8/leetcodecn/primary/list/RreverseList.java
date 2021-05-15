package com.lib8.leetcodecn.primary.list;

public class RreverseList {
    public ListNode reverseList(ListNode head) {
        ListNode result = new ListNode();
        while (head != null) {
            ListNode node = head;
            head = head.next;
            node.next = result.next;
            result.next = node;
        }
        return result.next;
    }
}
