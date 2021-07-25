package com.lib8.leetcodecn;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/6/2
 */
public class SubArraySum {
    public int subArraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                if (sum == k) {
                    count++;
                }
                sum += nums[j];
            }
            if (sum == k) {
                count++;
            }
        }
/*        int slow = 0;
        int fast = 1;
        int sum = nums[slow];
        while (fast < nums.length && slow < nums.length) {
            if (sum <= k) {
                if (sum == k) {
                    count++;
                }
                sum += nums[fast++];
            } else if (slow < fast) {
                sum -= nums[slow++];
            } else {
                sum = 0;
            }
        }
        while (slow < nums.length) {
            if (sum == k) {
                count++;
            }
            sum -= nums[slow++];
        }*/
        return count;
    }
}
