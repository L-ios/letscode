package com.lib8.leetcodecn.primary.tree;

import java.util.List;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;
import com.lib8.leetcodecn.base.TreeNode;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/5/18
 */
public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> chanel = new LinkedList<>();
        chanel.add(root);
        while (!chanel.isEmpty()) {
            int chanelSize = chanel.size();
            List<Integer> curLevel = new ArrayList<>();
            for (int i = 0; i < chanelSize; i++) {
                TreeNode node = chanel.poll();
                if (node.left != null) {
                    chanel.add(node.left);
                }
                if (node.right != null) {
                    chanel.add(node.right);
                }
                curLevel.add(node.val);
            }
            result.add(curLevel);
        }
        return result;
    }
}
