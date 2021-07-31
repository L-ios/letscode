package com.lib8.leetcodecn;

import com.lib8.leetcodecn.primary.list.ListNode;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/7/22
 */
public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next !=null) {
            fast = fast.next.next;
            slow = slow.next;
            // 此处重点，先移动，再比较
            if (fast == slow) {
                break;
            }
        }
        if (fast !=null && fast.next !=null) {
            fast = head;
            while (fast != slow) {
                fast = fast.next;
                slow = slow.next;
            }
        } else {
            // 一定要赋值，防止 fast.next == null
            fast = null;
        }
        return fast;
    }
}
