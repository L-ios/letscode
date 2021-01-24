package com.lib8.leetcodecn.base;

import java.util.Arrays;

/**
 * Project: letscode
 *  <a herf="https://leetcode-cn.com/problems/binary-search/">二分查找</a>
 *
 * @author: Lionseun Ling
 * @create: 2020/12/14
 */
public class BinarySearch {
    /**
     * 索引值
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = nums[mid];
            if (midVal < target) {
                low = mid + 1;
            } else if (midVal > target) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
