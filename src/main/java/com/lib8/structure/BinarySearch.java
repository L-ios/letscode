package com.lib8.structure;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/8/11
 */
public class BinarySearch {

    /**
     *
     * 递归二分查找，找到索引值
     *
     * @param nums
     * @return
     */
    public static int recursive(int[] nums, int target) {
        return recursive(nums, target, 0, nums.length-1);
    }

    private static int recursive(int[] nums, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + ((end - start) >> 2);
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            return recursive(nums, target, start, mid-1);
        } else {
            return recursive(nums, target, mid+1, end);
        }
    }

    /**
     *
     * 迭代查找索引值
     *
     * @param nums
     * @return
     */
    public static int iter(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;

        while (start <= end) {
            int mid = start + ((end - start) >> 1);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
