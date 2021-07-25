package com.lib8.leetcodecn.primary.list;

public class CycleList {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        boolean slowStop = true;
        while (fast != null) {
            fast = fast.next;
            if (slowStop) {
                slowStop = false;
            } else {
                slowStop = true;
                slow = slow.next;
            }
            if (fast == slow) {
                return true;
            }
        }

        return false;
    }

    public boolean hasCycle2(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null) {
            if (fast.next == null) {
                break;
            }
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
