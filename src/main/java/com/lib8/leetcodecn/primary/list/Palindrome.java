package com.lib8.leetcodecn.primary.list;

import java.util.List;

/**
 * Project: letscode
 *  <a herf="https://leetcode-cn.com/problems/binary-search/">回文链表</a>
 *
 * 里面提到了两种要求
 * 1. O(n) 时间复杂度: 采用stack的形式
 * 2. O(1) 空间复杂度：采用快慢指针，反转链表
 *
 * @author: Lionseun Ling
 */
public class Palindrome {

    public boolean isPalindrome(ListNode head) {
        // throw new UnsupportedOperationException("need achieve");
        return space_O_1(head);
    }

    private boolean time_O_n(ListNode head) {
        throw new UnsupportedOperationException("need achieve");
    }

    /**
     * 空间复杂度 O(1) ,采用快慢指针，当快指针找到中位是，直接进行后半段链表的反转
     * @param head
     * @return
     */
    private boolean space_O_1(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode fast = head;
        ListNode slow = head;
        // 快慢指针将链表折半
        // 1 2 3 4 5
        // 1 2 3 4
        while (fast.next != null) {
            if (fast.next.next == null) {
                break;
            }
            fast = fast.next.next;
            slow = slow.next;
        }

        // 此时 head 为 first的终止节点
        fast = reverseList(slow.next);
        slow.next = null;

        // 比较两个链表
        while (head != null && fast != null) {
            if (head.val != fast.val) {
                break;
            }
            head = head.next;
            fast = fast.next;
        }

        return fast == null;
    }

    /**
     * 反转列表, 思路：创建一个临时头结点，遍历链表，将链表进行反转
     * @param head
     * @return 反转好后的链表
     */
    private ListNode reverseList(ListNode head) {
        ListNode root = new ListNode();
        while (head != null) {
            ListNode node = head;
            head = head.next;
            node.next = root.next;
            root.next = node;
        }

        return root.next;
    }
}

