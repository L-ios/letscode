package com.lib8.leetcodecn.base;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/4/14
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                '}';
    }
}
