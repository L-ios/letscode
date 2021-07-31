package com.lib8.leetcodecn;

import com.lib8.leetcodecn.base.TreeNode;

import javax.management.Query;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/5/31
 */
public class MinDepth {
    public int minDepth(TreeNode root) {
        int depth = 0;
        if (root == null) {
            return depth;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        depth++;
        out:
        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left == node.right) {
                    break out;
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            depth++;
        }
        return depth;
    }
}
