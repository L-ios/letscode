package com.lib8.leetcodecn.primary.array;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2020/12/12
 */
public class SingleOne {
    public int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }
}
