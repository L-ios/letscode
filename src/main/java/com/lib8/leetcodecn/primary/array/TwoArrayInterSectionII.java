package com.lib8.leetcodecn.primary.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * <a herf="https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2y0c2/">两个数组的交集II</a>
 *
 * @author: Lionseun Ling
 * @create: 2021/01/20
 */
public class TwoArrayInterSectionII {
    /**
     * 排序后，通过双指针的形式进行遍历处理
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int resultSize = Math.min(nums1.length, nums2.length);
        int[] result = new int[resultSize];
        int resultLength = 0;
        for (int index1 = 0, index2 = 0; index1 < nums1.length && index2 < nums2.length;) {
            if (nums1[index1] < nums2[index2]) {
                index1++;
            } else if (nums1[index1] == nums2[index2]) {
                result[resultLength++] = nums1[index1];
                index1++;
                index2++;
            } else {
                index2++;
            }
        }

        return Arrays.copyOfRange(result, 0, resultLength);
    }

    /**
     * 利用Map对小数组进行数字的数量统计
     */
    public int[] mapIntersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            mapIntersect(nums2, nums1);
        }

        Map<Integer, Integer> numCountMap = new HashMap<>();
        for (int i : nums1) {
            numCountMap.merge(i, 1, Integer::sum);
        }
        int[] intersections = new int[nums1.length];
        final AtomicInteger intersectionSize = new AtomicInteger(0);
        for (int i : nums2) {
            numCountMap.computeIfPresent(i, (key, oldValue) -> {
                intersections[intersectionSize.getAndIncrement()] = key;
                return oldValue > 1 ? oldValue-1 : null;
            });
        }
        return Arrays.copyOfRange(intersections, 0, intersectionSize.get());
    }
}
