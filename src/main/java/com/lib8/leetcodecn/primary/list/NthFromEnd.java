package com.lib8.leetcodecn.primary.list;

public class NthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast.next != null) {
            fast = fast.next;
            if (n > 0) {
                n --;
            } else {
                slow = slow.next;
            }
        }
        if (n == 1) {
            return head.next;
        }

        slow.next = slow.next.next;
        return head;
    }
}


