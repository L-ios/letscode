package com.lib8.leetcodecn.primary2.array;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/6/6
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[slow] != nums[fast]) {
                nums[++slow] = nums[fast];
            }
        }
        return slow + 1;
    }
}
