package com.lib8.leetcodecn.primary.tree;

import com.lib8.leetcodecn.base.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/5/15
 */
public class ValidBST {
    /**
     * 验证二叉搜索树
     *
     * @param root
     * @return
     */
    public static boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    /**
     * 解法：利用区间，递归进行解题
     * @param root
     * @param min
     * @param max
     * @return
     */
    public static boolean isValidBST(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }
        if (!((min < (long)root.val) && ((long)root.val < max))) {

        }
        return isValidBST(root.left, min, root.val) & isValidBST(root.right, root.val, max);
    }

    public static boolean isValidBST_stack(TreeNode root) {
        // 中序遍历的返回值
        List<Integer> inOrderList = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();

        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.peek();
        }
        return false;
    }

    private static TreeNode preNode = null;
    public static boolean recursionValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (!recursionValidBST(root.left)) {
            return false;
        }
        if (preNode != null && preNode.val > root.val) {
            return false;
        }
        preNode = root;
        if (!recursionValidBST(root.right)) {
            return false;
        }
        return true;
    }
}
