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
        mergeSort(nums, 0, nums.length-1);
    }

    private void mergeSort(int[] nums, int start, int end) {
        if (start >= end) {
            return ;
        }
        int middle = start + (end - start) / 2 ; // 不写成 （start + end) / 2是为了防止整数溢出
        mergeSort(nums, start, middle);
        mergeSort(nums, middle + 1, end);
        merge(nums, start, middle+1, end);
    }

    private void merge(int[] nums, int lPos, int rPos, int rEnd) {
        int[] temp = new int[rEnd-lPos+1]; // 防止内存溢出
        int tempIndex = 0;
        int lEnd = rPos -1;
        while (lPos <= lEnd && rPos <= rEnd) {
            if (nums[lPos] <= nums[rPos]) {
                temp[tempIndex++] = nums[lPos++];
            } else {
                temp[tempIndex++] = nums[rPos++];
            }
        }
        while (lPos <= lEnd) {
            temp[tempIndex++] = nums[lPos++];
        }
        while (rPos <= rEnd) {
            temp[tempIndex++] = nums[rPos++];
        }
        for (tempIndex--; tempIndex >= 0; tempIndex--, rEnd--) {  // 需要先减一就
            nums[rEnd] = temp[tempIndex];
        }
    }


    public void quickSort(int[] nums) {
        quickSort(nums, 0, nums.length-1);
    }

    public void quickSort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }

        int pivotIndex = partition(nums, start, end);
        quickSort(nums, start, pivotIndex-1);
        quickSort(nums, pivotIndex+1, end);
    }

    public int partition(int[] nums, int start, int end) {
        int pivot = nums[end];
        int i = start;
        for (int j = i; j < end; j++) { // 重点：走到end前一个点
            if (nums[j] < pivot) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        int temp = nums[i];
        nums[i] = nums[end];
        nums[end] = temp;
        return i;
    }
}
