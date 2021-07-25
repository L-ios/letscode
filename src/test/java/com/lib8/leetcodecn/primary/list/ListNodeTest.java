package com.lib8.leetcodecn.primary.list;

import org.junit.jupiter.api.Test;

import static com.lib8.leetcodecn.primary.list.ListNode.sentialReverse;
import static com.lib8.leetcodecn.primary.list.ListNode.josephusProblem;

import static org.assertj.core.api.Assertions.assertThat;

class ListNodeTest {

    /**
     * 空链表
     */
    @Test
    void sentialReverse_should_return_input_list_when_empty_list() {
        ListNode node = new ListNode(-1);
        sentialReverse(node);
        assertThat(node).hasFieldOrPropertyWithValue("val", -1)
                .hasFieldOrPropertyWithValue("next", null);
    }

    /**
     * 一个节点
     */
    @Test
    void sentialReverse_should_return_input_list_when_siglention_list() {
        ListNode header = buildListWithString("A");
        sentialReverse(header);
        assertThat(listToStr(header)).isEqualTo("A");
    }

    /**
     * 两个节点
     */
    @Test
    void sentialReverse_should_return_BA_when_AB_list() {
        ListNode header = buildListWithString("AB");
        sentialReverse(header);
        assertThat(listToStr(header)).isEqualTo("BA");
    }

    ListNode buildListWithString(String sentens) {
        ListNode header = new ListNode(-1);
        ListNode cur = header;
        for (int i = 0; i < sentens.length(); i++) {
            cur.next = new ListNode(sentens.charAt(i));
            cur = cur.next;
        }
        return header;
    }

    String listToStr(ListNode header) {
        ListNode node = header.next;
        StringBuilder sb = new StringBuilder();
        while(node != null) {
            sb.append((char)node.val);
            node = node.next;
        }
        return sb.toString();
    }

    ListNode buildJosephusList(int size) {
        ListNode header = new ListNode(-1);
        ListNode cur = header;
        for (int i = 1; i <= size; i++) {
            cur.next = new ListNode(i);
            cur = cur.next;
        }
        cur.next = header.next;
        return header;
    }

    @Test
    void jousephusList_should_return_1_4_when_4_players_k_is_3() {
        assertThat(josephusResult(4, 3)).contains(1, 4);
    }

    @Test
    void josephusList_should_return_1_2_when_3_players_k_is_3() {
        assertThat(josephusResult(3, 3)).contains(1, 2);
    }

    @Test
    void josephusList_should_return_34_when_54_players_k_is_3() {
        assertThat(josephusResult(54, 3)).contains(1, 23);
    }

    int [] josephusResult(int count, int k) {
        ListNode josephusList = buildJosephusList(count);
        josephusProblem(josephusList, k);
        return extractJosePhusList(josephusList, k);
    }

    int[] extractJosePhusList(ListNode josephusList, int k) {
        int[] josephusArr = new int[k-1];
        ListNode cur = josephusList.next;
        for (int i = 0; i < k-1; i++) {
            josephusArr[i] = cur.val;
            cur = cur.next;
        }
        return josephusArr;
    }
}