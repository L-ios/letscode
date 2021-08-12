package com.lib8.leetcode.editor.cn;
//给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。 
//
// 请必须使用时间复杂度为 O(log n) 的算法。 
//
// 
//
// 示例 1: 
//
// 
//输入: nums = [1,3,5,6], target = 5
//输出: 2
// 
//
// 示例 2: 
//
// 
//输入: nums = [1,3,5,6], target = 2
//输出: 1
// 
//
// 示例 3: 
//
// 
//输入: nums = [1,3,5,6], target = 7
//输出: 4
// 
//
// 示例 4: 
//
// 
//输入: nums = [1,3,5,6], target = 0
//输出: 0
// 
//
// 示例 5: 
//
// 
//输入: nums = [1], target = 0
//输出: 0
// 
//
// 
//
// 提示: 
//
// 
// 1 <= nums.length <= 104 
// -104 <= nums[i] <= 104 
// nums 为无重复元素的升序排列数组 
// -104 <= target <= 104 
// 
// Related Topics 数组 二分查找 
// 👍 1010 👎 0

/**
 * Project: letscode
 * Question: 35
 *
 * @author: Lionseun Ling
 * @create: 2021-08-12 23:08:110
 */
public class QSearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        return new Solution().searchInsert(nums, target);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
    }
private static
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        int mid = 0;
        while (start <= end) {
            mid = (start + end)>>1;
            if (nums[mid] == target) {
                start = mid;
                break;
            }
            if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid+1;
            }
        }

        return start;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}