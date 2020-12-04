package com.lib8.leetcodecn.primary.array;

/**
 * <a herf="https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2gy9m/">删除排列数组中的重复项</a>
 *
 * @author: Lionseun Ling
 * @create: 2020/12/5
 */
public class DeleteDuplicate {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        int head =0, tail = 0;
        for (tail++; tail < length; tail++) {
            if (nums[head] != nums[tail]) {
                nums[++head] = nums[tail];
            }
        }
        return head+1;
    }
}
