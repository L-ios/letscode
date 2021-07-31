package com.lib8.leetcodecn.primary.math;

import java.util.Map;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/5/23
 */
public class RomanToInt {
    public static int romanToInt(String s) {
        char[] map = new char['Y'];
        map['I'] = 1;
        map['V'] = 5;
        map['X'] = 10;
        map['L'] = 50;
        map['C'] = 100;
        map['D'] = 500;
        map['M'] = 1000;
        // 利用队列,
        int pre = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int toInt = map[s.charAt(i)];
            result += toInt;
            if (toInt > pre) {
                result -= 2 * pre;
            }
            pre = toInt;
        }

        return result;
    }
}
