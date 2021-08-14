package com.lib8.leetcode.editor.cn;
//在无限的整数序列 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...中找到第 n 位数字。 
//
// 
//
// 注意：n 是正数且在 32 位整数范围内（n < 231）。 
//
// 
//
// 示例 1： 
//
// 
//输入：3
//输出：3
// 
//
// 示例 2： 
//
// 
//输入：11
//输出：0
//解释：第 11 位数字在序列 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... 里是 0 ，它是 10 的一部分。
// 
// Related Topics 数学 二分查找 
// 👍 169 👎 0

/**
 * Project: letscode
 * Question: 400
 *
 * @author: Lionseun Ling
 * @create: 2021-08-13 22:37:55
 */
public class QNthDigit {
    public static void main(String[] args) {
        long sum = 0;
        for (int i = 1; i < 11; i++) {
            long t = 9 * i * (long)Math.pow(10, i-1);
            sum += t;
            // System.out.println(t);
            System.out.println(sum);
        }
        Solution solution = new Solution();
        System.out.println(solution.findNthDigit(9));
        System.out.println(solution.findNthDigit(1000000000));
        System.out.println(solution.findNthDigit(Integer.MAX_VALUE)); // 2
    }
private static
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findNthDigit1(int n) {
        long nr = n;
        long sum = 0;
        long start = 1;
        int i = 1;
        for (; i < 11; i++) {
            start = (long) Math.pow(10, i-1);
            long nextsum = sum + 9 * i * start;
            if (nr > sum && nr <= nextsum) {
                break;
            }
            sum = nextsum;
        }
        nr = nr - sum;
        long value = start + (nr-1) / i;
        return Long.toString(value).charAt((int)(nr-1)%i) - '0';
    }

    public int findNthDigit(int n) {
        long start = 1;
        int i = 1;
        for (; i < 11; i++) {
            long end = 9 * i * start;
            if (n <= end) {
                break;
            }
            n -= end;
            start *= 10;
        }
        long value = start + (n-1) / i;
        return Long.toString(value).charAt((n-1) %i) - '0';
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}