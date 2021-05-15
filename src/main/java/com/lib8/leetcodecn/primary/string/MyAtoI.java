package com.lib8.leetcodecn.primary.string;

import java.math.BigInteger;

public class MyAtoI {
    public int myAtoi(String s) {
        int low = 0;

        while (low < s.length() && Character.isWhitespace(s.charAt(low))) {
            low++;
        }
        if (low >= s.length()) {
            return 0;
        }

        int positive = 1;
        char singer = s.charAt(low);
        if (!Character.isDigit(singer)) {
            if (singer == '-') {
                positive = -1;
            } else if (singer != '+') {
                return 0;
            }
            low++;
        }


        int high = low;
        for (; high < s.length(); high++) {
            if (!Character.isDigit(s.charAt(high))) {
                break;
            }
        }

        return innerAtoi(s.substring(low, high), positive);
    }

    private int innerAtoi(String s, int positive) {
        int result = 0, pre = 0;
        for (int i = 0; i < s.length(); i++) {
            pre = result;
            result = result * 10 + s.charAt(i) - '0';
            if (result / 10 != pre) {
                if (positive > 0) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }
        }
        return positive * result;
    }
}
