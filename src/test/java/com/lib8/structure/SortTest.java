package com.lib8.structure;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/7/29
 */
public class SortTest {

    @Test
    public void insertionTest() {
        int[] nums = new int[] {4, 5, 6, 1, 3, 2};
        new Sort().insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    @Test
    public void selectionSort() {
        int[] nums = new int[] {4, 5, 6, 1, 3, 2};
        new Sort().selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}