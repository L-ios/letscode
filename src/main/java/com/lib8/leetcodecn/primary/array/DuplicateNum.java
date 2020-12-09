package com.lib8.leetcodecn.primary.array;

import java.util.HashSet;
import java.util.Set;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2020/12/10
 */
public class DuplicateNum {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        return numSet.size() == nums.length;
    }
}
