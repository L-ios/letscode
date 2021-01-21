package com.lib8.leetcodecn.primary.array;


import java.util.HashMap;
import java.util.Map;

/**
 * <a herf="https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2jrse/">两数之和</a>
 *
 * @author: Lionseun Ling
 * @create: 2021/01/21
 */
public class TwoNumSum {
    public int[] twoSum(int[] nums, int target) {
        // 差值索引
        Map<Integer, Integer> subIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (subIndex.containsKey(num)) {
                return new int[] {i, subIndex.get(num)};
            }
            subIndex.put(target - num, i);
        }
        return null;
    }
}
