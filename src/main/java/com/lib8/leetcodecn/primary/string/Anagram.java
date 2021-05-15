package com.lib8.leetcodecn.primary.string;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> charSumMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            charSumMap.merge(s.charAt(i), 1, Integer::sum);
        }
        for (int i = 0; i < t.length(); i++) {
            charSumMap.computeIfPresent(t.charAt(i), (key, oldValue) -> oldValue > 1 ? oldValue - 1: null);
        }
        return charSumMap.isEmpty();
    }
}
