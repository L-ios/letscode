package com.lib8.leetcodecn.base;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/4/8
 */
public class FindMin {
    public int findMin(int[] nums) {
        return Arrays.stream(nums).min().getAsInt();
    }
}
