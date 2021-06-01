package com.lib8.leetcodecn.primary.array;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/1/17
 */
public class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = head;
        ListNode last = pre;
        for (int i = 0; i < n+1; i++) {
            if (last != null) {
                last = last.next;
            }
        }

        while (last != null) {
            last = last.next;
            pre = pre.next;
        }
        if (head == pre && n > 2) {
            return head.next;
        } else {
            pre.next = pre.next.next;
            return head;
        }
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}
