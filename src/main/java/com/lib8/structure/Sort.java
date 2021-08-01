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

    /**
     * 插入排序
     * @param nums
     */
    public void insertionSort2(int[] nums) {
        for (int i = 1; i < nums.length; i++) {  // 跳过第一个值
            int base = nums[i];
            for (int j = i-1; j >= 0; j--) {
                if (base < nums[j]) {
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    public void insertionSort3(int[] nums) {
        for (int i = 1; i < nums.length; i++) {  // 跳过第一个值
            int base = nums[i];
            int j = i -1;
            for (; j >= 0; j--) {
                if (base < nums[j]) {
                    nums[j+1] = nums[j];
                } else {
                    break;
                }
            }
            nums[j+1] = base;
        }
    }

    public void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int base = nums[i]; // 缓存插入的值
            int j = i;
            for (; j >0 && nums[j-1] > base ; j--) {
                nums[j] = nums[j-1];
            }
            nums[j] = base; // 缓存的值，插到数组中
        }
    }

    public void selectionSort2(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
            }
        }
    }

    public void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minIndex = i;
            for (int j = nums.length -1; j > i; j--) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
            }
        }
    }

    public void mergeSort(int[] nums) {

    }

    private void mergeSort(int[] nums, int start, int end) {
        if (start <= end) {
            return ;
        }
        int middle = start + (end - start) / 2 ; // 不写成 （start + end) / 2是为了防止整数溢出
        mergeSort(nums, start, middle);
        mergeSort(nums, middle + 1, end);
        merge();
    }

    private void merge() {

    }

}
