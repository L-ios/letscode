package com.lib8.leetcodecn.primary.string;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String baseStr = strs[0];
        for (int i = 1; i < strs.length; i++) {
            baseStr = longestCommonPrefix(baseStr, strs[i]);
            if (baseStr.length() == 0) {
                break;
            }
        }
        return baseStr;
    }

    public String longestCommonPrefix(String base, String more) {
        int minLength = Math.min(base.length(), more.length());
        int i = 0;
        for (; i < minLength; i++) {
            if (base.charAt(i) != more.charAt(i)) {
                break;
            }
        }
        return base.substring(0, i);
    }
}
