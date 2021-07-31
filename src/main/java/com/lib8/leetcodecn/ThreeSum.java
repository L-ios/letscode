package com.lib8.leetcodecn;

import java.util.*;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/6/2
 */
public class ThreeSum {

    // 利用回溯算法
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> target = new HashSet<>();
        ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            pathed.clear();
            if (target.contains(nums[i])) {
                continue;
            }
            target.add(nums[i]);
            sum(nums, i+1, -nums[i]);
        }
        return ans;
    }
    List<List<Integer>> ans;
    Set<Integer> pathed = new HashSet<>();
    public void sum(int[] nums, int i, int target) {
        int pre = Integer.MAX_VALUE;
        for (; i < nums.length; i++) {
            if (pathed.contains(target - nums[i]) && pre != nums[i]) {
                List<Integer> res = new ArrayList<>();
                res.add(-target);
                res.add(target-nums[i]);
                res.add(nums[i]);
                ans.add(res);
                pre = nums[i];
            }else {
                pathed.add(nums[i]);
            }
        }
    }
}
