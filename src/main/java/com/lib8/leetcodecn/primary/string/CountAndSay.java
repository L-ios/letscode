package com.lib8.leetcodecn.primary.string;

import java.util.Deque;
import java.util.LinkedList;

public class CountAndSay {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String baseStr = countAndSay(n - 1);
        Deque<Character> stack = new LinkedList<>();
        stack.push(baseStr.charAt(0));
        StringBuffer buffer = new StringBuffer();
        for (int i = 1; i < baseStr.length(); i++) {
            char newBase = baseStr.charAt(i);
            char top = stack.peek();
            if (newBase == top) {
                stack.push(newBase);
            } else {
                buffer.append(stack.size());
                buffer.append(top);
                stack.clear();
                stack.push(newBase);
            }
        }
        buffer.append(stack.size());
        buffer.append(stack.pop());

        return buffer.toString();
    }
}
