package com.lib8.leetcodecn.base;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/4/12
 */
public class LargestNumber {
    /**
     * 1、转换为字符串
     * 2、排序
     * 3、合并
      */
    public String largestNumber(int[] nums) {
        String[] objects = Arrays.stream(nums).mapToObj(String::valueOf).sorted((numStr1, numStr2) -> {
            if (numStr1.length() <= numStr2.length()) {
                return -compare(numStr1, numStr2);
            } else {
                return compare(numStr2, numStr1);
            }
        }).toArray(String[]::new);
        if (Integer.valueOf(objects[0]) == 0) {
            return "0";
        } else {
            return Arrays.stream(objects).collect(Collectors.joining());
        }
    }

    /**
     * 默认 <code>numStr1.length() < numStr2.length()</code>
     */
    public int compare(String numStr1, String numStr2) {
        return (int) (Long.valueOf(numStr1+numStr2) - Long.valueOf(numStr2+numStr1));
    }
}
