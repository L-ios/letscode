package com.lib8.leetcodecn.primary.string;

public class ReverseString {
    public void reverseString(char[] s) {
        int low = 0;
        int high = s.length - 1;
        char tmp = (char) 0;
        while (low < high) {
            tmp = s[low];
            s[low]= s[high];
            s[high] = tmp;
            low++;
            high--;
        }
    }
}
