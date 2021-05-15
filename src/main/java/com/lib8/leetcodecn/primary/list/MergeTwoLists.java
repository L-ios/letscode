package com.lib8.leetcodecn.primary.list;

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode root = new ListNode();
        ListNode point = root;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val){
                point.next = l1;
                l1 = l1.next;
            } else {
                point.next = l2;
                l2 = l2.next;
            }
            point = point.next;
        }

        if (l1 != null) {
            point.next = l1;
        }
        if (l2 != null) {
            point.next = l2;
        }

        return root.next;
    }
}
