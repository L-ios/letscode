package com.lib8.leetcode.editor.cn;
//给定两个排序后的数组 A 和 B，其中 A 的末端有足够的缓冲空间容纳 B。 编写一个方法，将 B 合并入 A 并排序。 
//
// 初始化 A 和 B 的元素数量分别为 m 和 n。 
//
// 示例: 
//
// 输入:
//A = [1,2,3,0,0,0], m = 3
//B = [2,5,6],       n = 3
//
//输出: [1,2,2,3,5,6] 
//
// 说明: 
//
// 
// A.length == n + m 
// 
// Related Topics 数组 双指针 排序 
// 👍 111 👎 0

/**
 * Project: letscode
 * Question: 面试题 10.01
 *
 * @author: Lionseun Ling
 * @create: 2021-08-04 23:50:28
 */
public class QSortedMergeLcci {
    public static void main(String[] args) {
        Solution solution = new Solution();
    }

    public static void merge(int[] A, int m, int[] B, int n) {
        new Solution().merge(A, m, B, n);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    private static class Solution {
        /**
         * 使用插入排序算法的思路
         */
        public void merge2(int[] A, int m, int[] B, int n) {
            for (int i = 0; i < B.length; i++, m++) {
                int j = m;
                for (; j > 0 && A[j - 1] > B[i]; j--) {
                    A[j] = A[j - 1];
                    A[j - 1] = B[i];
                }
                A[j] = B[i];
            }
        }

        /**
         * 使用快慢指针的方式
         */
        public void merge(int[] A, int m, int[] B, int n) {
            int p = A.length - 1;
            m--;
            n--;
            while (m >= 0 && n >= 0) {
                if (A[m] > B[n]) {
                    A[p] = A[m--];
                } else {
                    A[p] = B[n--];
                }
                p--;
            }
            // 如果 m > 0 则 A 中剩余的数都比B小
            while (n >= 0) { // A 中的有效数都已向后移动
                A[p--] = B[n--];
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}