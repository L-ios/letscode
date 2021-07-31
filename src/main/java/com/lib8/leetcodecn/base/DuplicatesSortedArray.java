package com.lib8.leetcodecn.base;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/4/6
 */
public class DuplicatesSortedArray {
    public int removeDuplicatessi(int[] nums) {
        int i = 0;
        for (int n : nums) {
            if (i < 2 || n > nums[i - 2]) {
                nums[i++] = n;
            }
        }
        return i;
    }

    public int removeDuplicates(int[] nums) {
        int slow = 0;
        for (int num : nums) {
            //
            if (slow < 2 || num > nums[slow-2]) {
                nums[slow++] = num;
            }
        }
        return slow;
    }


}
