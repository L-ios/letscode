package com.lib8.leetcodecn.primary.string;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqChar {
    public int firstUniqChar(String s) {
        Map<Character, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (indexMap.containsKey(ch) ){
                indexMap.put(ch, -1);
            } else {
                indexMap.put(ch, i);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (indexMap.get(ch) != -1) {
                return indexMap.get(ch);
            }
        }
        return -1;
    }
}
