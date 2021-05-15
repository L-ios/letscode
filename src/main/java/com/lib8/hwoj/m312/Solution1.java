package com.lib8.hwoj.m312;

/**
 * 系统中有一连续的内存，被划分成多个大小相同的内存块。
 */
public class Solution1 {

    /**
     * 释放cnt的内存块，获取最大的连续内存
     *
     * @param mMark 内存标记位，x表示内存使用，'.'表示内存未使用
     * @param cnt 需要释放的内存块数量
     * @return 释放后的最大连续内存
     */
    public static int maxRelease(String mMark, int cnt) {
        int slow = 0;

        for (int fast = 0; fast < mMark.length(); fast++) {
            if (mMark.charAt(fast) == 'x') {
                cnt--;
            }
            if (cnt < 0 && mMark.charAt(slow++) == 'x') {
                cnt++;
            }
        }
        return mMark.length() - slow;
    }
}
