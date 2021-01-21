package com.lib8.leetcodecn.primary.array;

/**
 * <a herf="https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2cv1c/">加一</a>
 *
 * @author: Lionseun Ling
 * @create: 2021/01/20
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        boolean carryUp = true;
        for (int lastIndex = digits.length-1;lastIndex  > -1; lastIndex--) {
            digits[lastIndex] += 1;
            if (digits[lastIndex] < 10) {
                carryUp = false;
                break;
            }
            digits[lastIndex] = 0;
        }

        if (carryUp) {
            digits = new int[digits.length+1];
            digits[0] = 1;
        }

        return digits;
    }
}
