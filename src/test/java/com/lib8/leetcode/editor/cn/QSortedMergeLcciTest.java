package com.lib8.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class QSortedMergeLcciTest {

    @Test
    void merge() {
        int[] A = new int[] {1,2,3,0,0,0};
        int[] B = new int[] {2, 5, 6};
        QSortedMergeLcci.merge(A, 3, B, 3);
        assertThat(A).containsSequence(1,2,2,3,5,6);
    }
    @Test
    void merge2() {
        int[] A = new int[] {0};
        int[] B = new int[] {1};
        QSortedMergeLcci.merge(A, 0, B, 1);
        assertThat(A).containsSequence(1);
    }

}