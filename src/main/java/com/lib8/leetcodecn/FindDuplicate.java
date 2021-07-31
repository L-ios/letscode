package com.lib8.leetcodecn;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/7/22
 */
public class FindDuplicate {
    public int findDuplicate(int[] nums) {
        Set<Integer> pathed = new HashSet<>();
        for (int num : nums) {
            if (pathed.contains(num)) {
                return num;
            } else {
                pathed.add(num);
            }
        }
        return -1;
    }

    /**
     * 此算法算是暴力解法
     * @param nums
     * @return
     */
    public int findDuplicate2(int[] nums) {
        int[] map = new int[nums.length+1];
        for (int num : nums) {
            if (map[num] != 0) {
                return num;
            } else {
                map[num] = 1;
            }
        }
        return -1;
    }

    /**
     * Floyd 圈算法
     * 思路：
     * 运用快慢指针进行查询，主要是为了链表入环节点
     *
     *
     * @param nums
     * @return
     */
    public int findDuplicateByFloydAlg(int[] nums) {
        int fast = 0;  // 算是头结点指针
        int slow = 0;
        while (true) {
            fast = nums[nums[fast]];
            slow = nums[slow];
            if (fast == slow) {
                break;
            }
        }
        fast = 0;
        while (fast != slow) {  // 此处为判断快慢指针走到同一个节点
            fast = nums[fast];
            slow = nums[slow];
        }
        return slow;  // 节点值
    }
}
