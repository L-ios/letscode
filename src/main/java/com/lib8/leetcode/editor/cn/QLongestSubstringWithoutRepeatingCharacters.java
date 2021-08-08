package com.lib8.leetcode.editor.cn;
//给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。 
//
// 
//
// 示例 1: 
//
// 
//输入: s = "abcabcbb"
//输出: 3 
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
// 
//
// 示例 2: 
//
// 
//输入: s = "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
// 
//
// 示例 3: 
//
// 
//输入: s = "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
// 
//
// 示例 4: 
//
// 
//输入: s = ""
//输出: 0
// 
//
// 
//
// 提示： 
//
// 
// 0 <= s.length <= 5 * 104 
// s 由英文字母、数字、符号和空格组成 
// 
// Related Topics 哈希表 字符串 滑动窗口 
// 👍 5874 👎 0

import java.util.HashSet;
import java.util.Set;

/**
 * Project: letscode
 * Question: 3
 *
 * @author: Lionseun Ling
 * @create: 2021-08-06 22:57:56
 */
public class QLongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Solution solution = new Solution();
        assert solution.lengthOfLongestSubstring("") == 0;
        assert solution.lengthOfLongestSubstring(" ") == 1;
        assert solution.lengthOfLongestSubstring("dvdf") == 3;
        assert solution.lengthOfLongestSubstring("pwwkes") == 3;
        assert solution.lengthOfLongestSubstring("abcabcbb") == 3;
    }

    public static int lengthOfLongestSubstring(String s) {
        return new Solution().lengthOfLongestSubstring(s);
    }
private static
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    /**
     * 使用快慢指针进行滑动
     * 1. contains is true 滑动慢指针
     * 2. else 滑动慢指针
     */
    public int lengthOfLongestSubstring(String s) {
        Set<Character> pathed = new HashSet<>();
        int slow = 0;
        int fast = 0;
        int maxSub = 0;
        // 判断要走到那一个字符串
        char dup = 0;
        while (fast < s.length() && slow < s.length()) {
            if (dup != 0) {
                if (s.charAt(slow)== dup) {
                    dup = 0;
                }
                pathed.remove(s.charAt(slow));
                slow++;
            } else {
                if (pathed.contains(s.charAt(fast))) {
                    dup = s.charAt(fast);
                    maxSub = Math.max(maxSub, pathed.size());
                } else {
                    pathed.add(s.charAt(fast));
                    fast++;
                }
            }
        }
        return Math.max(maxSub, pathed.size());
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}