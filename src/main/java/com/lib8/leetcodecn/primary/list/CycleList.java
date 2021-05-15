package com.lib8.leetcodecn.primary.list;

public class CycleList {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        boolean slowStop = true;
        while (fast != null) {
            if (fast.next == null) {
                break;
            }
            fast = fast.next;
            if (fast == slow) {
                return true;
            }
            if (slowStop) {
                slowStop = false;
            } else {
                slowStop = true;
                slow = slow.next;
            }
        }

        return false;
    }
}
