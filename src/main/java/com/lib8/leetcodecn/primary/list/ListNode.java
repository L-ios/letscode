package com.lib8.leetcodecn.primary.list;

import java.util.*;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/2/5
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "{" + this.val + "}";
    }

    /**
     * 哨兵模式反转列表，传入一个带头节点的链表，在链表上进行原地翻转
     *
     * @param list
     */
    public static final void sentialReverse(ListNode list) {
        ListNode cur = list.next;
        list.next = null;
        while(cur != null) {
            ListNode node = cur;
            cur = cur.next;
            node.next = list.next;
            list.next = node;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        head = null;
        while (cur != null) {
            ListNode node = cur;
            cur = cur.next;
            node.next = head;
            head = node;
        }
        return head;
    }

    public boolean hasCycleUseFastSlowRef(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        boolean slowRun = false;
        while (fast != null) {
            fast = fast.next;
            if (fast == slow) {
                return true;
            }
            if (slowRun) {
                slow = slow.next;
                slowRun = false;
            } else {
                slowRun = true;
            }
        }
        return false;
    }

    public boolean hasCycleUseFastSlowRef2(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    /**
     * 时间复杂度O(n)
     * 空间复杂度O(n)解法
     */
    public ListNode detectCycleWithSet(ListNode head) {
        Set<ListNode> visited = new HashSet<>();
        ListNode cur = head;
        while (cur!=null) {
            if (visited.contains(cur)) {
                return cur;
            } else {
                visited.add(cur);
            }
            cur = cur.next;
        }
        return null;
    }

    /**
     * 时间复杂度未知
     * 空间O(1)复杂度解法
     */
    public ListNode detectCycleO1Mem(ListNode head) {
        ListNode fast = head;
        ListNode slow = fast;
        boolean slowRun = false;
        while (fast != null) {
            fast = fast.next;
            if (slowRun) {
                slow = slow.next;
                slowRun = false;
            } else {
                slowRun = true;
            }
            if (slow == fast) {
                break;
            }
        }
        if (fast != null) {
            fast = head;
            while (fast != slow) {
                fast = fast.next;
                slow = slow.next;
            }
        }
        return fast;
    }

    public ListNode detectCycle02(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast != slow) {
                break;
            }
        }
        if (fast != null && fast.next != null) {
            fast = head;
            while (fast != slow) {
                fast = fast.next;
                slow = slow.next;
            }
        } else {
            fast = null;
        }
        return fast;
    }

    public static final void josephusProblem(ListNode header, int n) {
        ListNode cur = header.next;
        int size = 0;
        while (cur != null) {
            size++;
            cur = cur.next;
            if (cur == header.next) {
                break;
            }
        }

        int i = 1;
        while (size >= n) {
            if (i == n-1) {
                cur.next = cur.next.next;
                size--;
                i = 0;
            }
            cur = cur.next;
            i++;
        }
        header.next = cur;
    }
}
