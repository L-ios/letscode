package com.lib8.leetcodecn.primary.tree;

import com.lib8.leetcodecn.base.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/5/17
 */
public class Symmetric {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        Deque<TreeNode> localLevel = new LinkedList<>();
        localLevel.add(root.left);
        localLevel.add(root.right);
        Deque<TreeNode> nextLevel = new LinkedList<>();
        while (!localLevel.isEmpty()) {
            for (TreeNode treeNode : localLevel) {
                if (treeNode == null) {
                    continue;
                }
                nextLevel.add(treeNode.left);
                nextLevel.add(treeNode.right);
            }
            int levelSize = localLevel.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode left = localLevel.pollFirst();
                TreeNode right = localLevel.pollLast();
                if (left == null && right == null) {
                    continue;
                }
                if (left != null && right != null && left.val == right.val) {
                    continue;
                }
                return false;
            }
            localLevel.addAll(nextLevel);
            nextLevel.clear();
        }
        return true;
    }
}
