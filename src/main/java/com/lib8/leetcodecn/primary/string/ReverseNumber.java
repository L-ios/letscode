package com.lib8.leetcodecn.primary.string;

public class ReverseNumber {
    public int reverse(int x) {
        int[] nums = new int[10];
        int wei = 0;
        while (x != 0) {
            nums[wei++] = x % 10;
            x /= 10;
        }
        long result = 0;
        for (int i = 0; i < wei; i++) {
            result = result * 10 + nums[i];
        }
        return result != ((int) result) ? 0 : (int) result;
    }
}
