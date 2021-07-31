package com.lib8.leetcodecn;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/5/28
 */
public class TotalHammingDistance {
    public int totalHammingDistance(int[] nums) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int b = 0;
            int count = 0;
            for (int num : nums) {
                b ^= num;
                count += (b & 1);
            }
            ans += count * (nums.length - count);
        }
//        return ans;
        int result = 0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                result += hammingDistance(nums[i], nums[j]);
            }
        }
        return result;
    }

    int hammingDistance(int m, int n) {
        m ^= n;
        int result = 0;
        while (m != 0) {
            if ((m & 1) == 1) {
                result++;
            }
            m >>>= 1;
        }
        return result;
    }
}
