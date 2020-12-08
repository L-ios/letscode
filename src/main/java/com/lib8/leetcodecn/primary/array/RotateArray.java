package com.lib8.leetcodecn.primary.array;

/**
 * <a herf="https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2skh7/">旋转数组</a>
 *
 * @author: Lionseun Ling
 * @create: 2020/12/8
 */
public class RotateArray {
    public void rotate(int[] nums, int k) {
        if (k <= 0) {
            return;
        }

        // TODO: 2020/12/9 测试未过
        int length = nums.length;
        int eindex = k;
        for (int i = 0; i < length - 1 ; i++) {
            int sIndex = length - eindex;
            int temp = nums[i];
            nums[i] = nums[sIndex];
            nums[sIndex] = temp;
            eindex = eindex - 1;
            eindex = eindex > 0 ? eindex : k;
        }
    }
}
