package com.lib8.leetcodecn.primary.tree;

import com.lib8.leetcodecn.base.TreeNode;
/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/4/13
 */
public class MaxDepth {
    public int maxDepth(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }


}
