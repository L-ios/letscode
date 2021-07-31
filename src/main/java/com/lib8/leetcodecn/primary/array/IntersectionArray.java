package com.lib8.leetcodecn.primary.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2020/12/15
 */
public class IntersectionArray {
    public int[] intersect(int[] nums1, int[] nums2)  {
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        Arrays.sort(nums2);

        Set<Integer> intersection = new HashSet<>();
        for (int i : nums1) {
            int i2 = Arrays.binarySearch(nums2, i);
            if (i2 < 0) {
                continue;
            }
            intersection.add(nums2[i2]);
        }

        return getInts(intersection);
    }

    public int[] intersectSet(int[] nums1, int[] nums2) {
        Set<Integer> set1 = toSet(nums1);
        Set<Integer> set2 = toSet(nums2);
        if (set1.size() > set2.size()) {
            Set<Integer> temp = set1;
            set1 = set2;
            set2 = temp;
        }

        Set<Integer> intersection = new HashSet<>();
        for (Integer num : set1) {
            if (set2.contains(num)) {
                intersection.add(num);
            }
        }

        return getInts(intersection);
    }

    private int[] getInts(Set<Integer> intersection) {
        int[] result = new int[intersection.size()];
        int i = 0;
        for (Integer integer : intersection) {
            result[i++] = integer;
        }
        return result;
    }

    private Set<Integer> toSet(int[] nums1) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        return set;
    }
}
