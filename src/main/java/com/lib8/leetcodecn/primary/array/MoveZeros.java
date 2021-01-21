package com.lib8.leetcodecn.primary.array;

/**
 * <a herf="https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2ba4i/">移动零</a>
 *
 * @author: Lionseun Ling
 * @create: 2021/01/20
 */
public class MoveZeros {
    public void moveZeros(int[] nums) {
        int last = 0;
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != 0 && nums[last] == 0 ) {
                nums[last] = nums[fast];
                nums[fast] = 0;
            }
            if (nums[last] != 0) {
                last++;
            }
        }
    }
}
