package com.lib8.leetcodecn;


import java.util.LinkedList;
import java.util.List;

/**
 * <a herf="https://leetcode-cn.com/problems/add-to-array-form-of-integer/">数组形式的整数加法</a>
 *
 * @author: Lionseun Ling
 * @create: 2021/01/21
 */
public class AddToArrayForm {
    public List<Integer> addToArrayForm(int[] A, int K) {
        LinkedList<Integer> result = new LinkedList<>();

        int carry = 0;
        for (int arrayIndex = A.length - 1; arrayIndex >= 0; arrayIndex--) {
            carry += K % 10 + A[arrayIndex];
            result.addFirst(carry % 10);
            carry /= 10;
            K /= 10;
        }
        while (K > 0) {
            carry += K % 10;
            result.addFirst(carry % 10);
            K /= 10;
            carry /= 10;
        }
        if (carry > 0) {
            result.addFirst(1);
        }
        return result;
    }
}
