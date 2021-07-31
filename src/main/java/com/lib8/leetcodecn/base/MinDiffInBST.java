package com.lib8.leetcodecn.base;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/4/13
 */
public class MinDiffInBST {
    public int minDiffBST(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Integer> all = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
            all.add(node.val);
        }

        all.sort(Integer::compareTo);
        int minGap = all.get(1) - all.get(0);
        for (int i = 2; i < all.size(); i++) {
            minGap = Math.min(all.get(i) - all.get(i - 1), minGap);
        }
        return minGap;
    }
    int pre;
    int ans;
    public int minDiffInBST(TreeNode root) {
        ans = Integer.MAX_VALUE;
        pre = -1;
        dfs(root);
        return ans;
    }

    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }

        dfs(root.left);
        if (pre == -1) {
            pre = root.val;
        } else {
            ans = Math.min(ans, root.val - pre);
            pre = root.val;
        }
        dfs(root.right);
    }

    public int leftMax(TreeNode root) {

        return 0;
    }

    public int rightMin(TreeNode root) {
        return 0;
    }
}
