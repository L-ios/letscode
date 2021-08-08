package com.lib8.leetcode.editor.cn;
//给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。 
//
// 请你将两个数相加，并以相同形式返回一个表示和的链表。 
//
// 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。 
//
// 
//
// 示例 1： 
//
// 
//输入：l1 = [2,4,3], l2 = [5,6,4]
//输出：[7,0,8]
//解释：342 + 465 = 807.
// 这里需要使用栈
//
// 示例 2： 
//
// 
//输入：l1 = [0], l2 = [0]
//输出：[0]
// 
//
// 示例 3： 
//
// 
//输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//输出：[8,9,9,9,0,0,0,1]
// 
//
// 
//
// 提示： 
//
// 
// 每个链表中的节点数在范围 [1, 100] 内 
// 0 <= Node.val <= 9 
// 题目数据保证列表表示的数字不含前导零 
// 
// Related Topics 递归 链表 数学 
// 👍 6542 👎 0

/**
 * Project: letscode
 * Question: 2
 *
 * @author: Lionseun Ling
 * @create: 2021-08-05 23:54:58
 */
public class QAddTwoNumbers {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.addTwoNumbers(new ListNode(9), new ListNode(9));
    }

    private static
//leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode result = l1; // 以l1为基础
            int postInc = 0;
            ListNode pre = null;
            while (l1 != null && l2 != null) {
                l1.val += postInc + l2.val;
                if (l1.val > 9) {
                    postInc = 1;
                    l1.val -= 10;
                } else {
                    postInc = 0;
                }
                pre = l1;
                l1 = l1.next;
                l2 = l2.next;
            }
            l1 = l1 != null ? l1 : l2;
            pre.next = l1;
            while (l1 != null) {
                l1.val += postInc;
                if (l1.val > 9) {
                    postInc = 1;
                    l1.val -= 10;
                } else {
                    postInc = 0;
                }
                pre = l1;
                l1 = l1.next;
            }// 少一个pre
            if (postInc != 0) {
                pre.next = new ListNode(1);
            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}