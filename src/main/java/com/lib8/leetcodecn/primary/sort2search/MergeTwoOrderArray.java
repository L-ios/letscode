package com.lib8.leetcodecn.primary.sort2search;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/5/19
 */
public class MergeTwoOrderArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 反向操作？
        int slow = 0; // to nums2
        for (int fast = 0; fast < m + n; fast++) {
            if (nums1[fast] > nums2[slow]) {
                int temp = nums1[fast];
                nums1[fast] = nums2[slow];
                nums1[slow] = temp;
            } else {

            }
        }
    }
}
