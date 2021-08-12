package com.lib8.structure;

import org.junit.jupiter.api.Test;

import static com.lib8.structure.BinarySearch.recursive;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/8/11
 */
public class BinarySearchTest {

    @Test
    public void recursiveBSearch() {
        assertThat(recursive(new int[]{1, 2, 3}, 1)).isEqualTo(0);
        assertThat(recursive(new int[]{1, 2, 3}, 2)).isEqualTo(1);
        assertThat(recursive(new int[]{1, 2, 3}, 3)).isEqualTo(2);
        assertThat(recursive(new int[]{1, 2, 3}, 4)).isEqualTo(-1);
    }

    @Test
    public void iteratorBSearch() {

    }
}
