package com.lib8.leetcode.editor.cn;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class QSearchInsertPositionTest {

    @Test
    void a() {
        assertThat(searchInsert(0, 1)).isEqualTo(0);
    }

    @Test
    void b() {
        assertThat(searchInsert(5, 1, 3, 5, 6, 8, 9)).isEqualTo(2);
    }

    @Test
    void c() {
        assertThat(searchInsert(2, 1, 3, 5, 6)).isEqualTo(1);
    }

    @Test
    void d() {
        assertThat(searchInsert(7, 1, 3, 5, 6)).isEqualTo(4);
    }

    @Test
    void e() {
        assertThat(searchInsert(2, 1, 3)).isEqualTo(1);
    }

    @Test
    void f() {
        assertThat(searchInsert(-2, 1, 3)).isEqualTo(0);
    }

    @Test
    void g() {
        assertThat(searchInsert(0, 1, 3, 5, 6)).isEqualTo(0);
    }

    @Test
    void h() {
        assertThat(searchInsert(3, 1, 3)).isEqualTo(1);
    }





    int searchInsert(int target, int... nums) {
        return QSearchInsertPosition.searchInsert(nums, target);
    }


}