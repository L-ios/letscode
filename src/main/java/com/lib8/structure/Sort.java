package com.lib8.structure;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/7/28
 */
public class Sort {

    /**
     * 原地排序
     * @param nums
     */
    public void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean isSwap = false;
            for (int j = 0; j < nums.length - i -1; j++) {
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
            if (!isSwap) {
                break;
            }
        }
    }
}
