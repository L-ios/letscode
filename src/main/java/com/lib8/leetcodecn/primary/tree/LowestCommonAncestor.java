package com.lib8.leetcodecn.primary.tree;

import com.lib8.leetcodecn.base.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/5/28
 */
public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Deque<TreeNode> pStack = new LinkedList<>();
        Deque<TreeNode> qStack = new LinkedList<>();
        findPath(root, p, pStack);
        findPath(root, q, qStack);
        TreeNode preNode = null;
        while (!pStack.isEmpty() && !qStack.isEmpty()) {
            TreeNode node = pStack.pollLast();
            if (node == qStack.pollLast()) {
                preNode = node;
            } else {
                break;
            }
        }
        return preNode;
    }

    public boolean findPath(TreeNode root, TreeNode p, Deque<TreeNode> stack) {
        if (root == null) {
            return false;
        }
        stack.push(root);
        if (root.val == p.val) {
            return true;
        }
        if (findPath(root.left, p, stack) || findPath(root.right, p, stack)) {
            return true;
        }
        stack.pop();
        return false;
    }
}
