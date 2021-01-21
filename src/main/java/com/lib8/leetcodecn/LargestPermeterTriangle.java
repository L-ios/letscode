package com.lib8.leetcodecn;

import java.util.Arrays;

/**
 * <a herf="https://leetcode-cn.com/problems/largest-perimeter-triangle/">三角形最大周长</a>
 *
 * @author: Lionseun Ling
 * @create: 2021/01/21
 */
public class LargestPermeterTriangle {
    public int largestPermeter(int[] A) {
        Arrays.sort(A);
        int i = A.length -3;

        for (; i >= 0; i--) {
            int sum = A[i] + A[i+1] + A[i +2];
            if (isTriangle(A[i], A[i+1], A[i+2])) {
                return sum;
            }
        }
        return 0;
    }

    private boolean isTriangle(int low, int mid, int high) {
        return low + mid > high;
    }
}
