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
        throw new UnsupportedOperationException("need achieve");
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
        ListNode first = head;
        while (head.next != null && head.val != head.next.val) {
            head = head.next;
        }

        // 此时 head 为 first的终止节点
        ListNode second = reverseList(head.next);
        head.next = null;

        // 比较两个链表
        while (first != null && second != null) {
            if (first.val != second.val) {
                break;
            }
            first = first.next;
            second = second.next;
        }

        return first == null && second == null;
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

