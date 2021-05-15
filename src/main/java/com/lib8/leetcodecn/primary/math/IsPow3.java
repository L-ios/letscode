package com.lib8.leetcodecn.primary.math;

public class IsPow3 {
    public boolean isPowerOfThree(int n) {
        if (n == 0) {
            return true;
        }

        return Integer.toString(3, 3).replaceAll("0", "").equals("1");
    }
}
