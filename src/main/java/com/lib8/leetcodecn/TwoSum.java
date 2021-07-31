package com.lib8.leetcodecn;

import java.util.HashMap;
import java.util.Map;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/6/2
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valIndeMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer index = valIndeMap.get(target - nums[i]);
            if (index != null) {
                return new int[] {index, i};
            } else {
                valIndeMap.put(nums[i], i);
            }
        }
        return null;
    }
}
