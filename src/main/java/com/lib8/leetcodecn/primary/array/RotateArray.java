package com.lib8.leetcodecn.primary.array;

import java.util.Arrays;

/**
 * <a herf="https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2skh7/">旋转数组</a>
 *
 * @author: Lionseun Ling
 * @create: 2020/12/8
 */
public class RotateArray {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        k %= length;
        int[] bnums = Arrays.copyOf(nums, length);
        for (int i = 0; i < length; i++) {
            nums[(i+k)%length] = bnums[i];
        }
    }

    /**
     * 空间复杂度为O(1)
     */
    public void rotate1(int[] nums, int k) {
        int length = nums.length;
        k %= length;
        reverse(nums, 0, length-k-1);
        reverse(nums, length-k, length-1);
        reverse(nums, 0, length-1);
    }

    private void reverse(int[] nums, int start, int end) {
        int temp;
        for (int i = 0; i <= (end-start)/2; i++) {
            temp = nums[start+i];
            nums[start+i] = nums[end-i];
            nums[end-i] = temp;
        }
    }
}
