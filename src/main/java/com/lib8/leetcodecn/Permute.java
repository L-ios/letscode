package com.lib8.leetcodecn;

import java.util.*;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/5/30
 */
public class Permute {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        LinkedList<Integer> pathed = new LinkedList<>();
        backtrace(nums, pathed);
        return  result;
    }

    void backtrace(int[] nums, LinkedList<Integer> pathed) {
        if (nums.length == pathed.size()) {
            result.add(new ArrayList<>(pathed));
        }
        for (int num : nums) {
            if (pathed.contains(num)) {
                continue;
            }
            pathed.add(num);
            backtrace(nums, pathed);
            pathed.removeLast();
        }
    }
}
