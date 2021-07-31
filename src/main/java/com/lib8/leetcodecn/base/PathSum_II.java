package com.lib8.leetcodecn.base;

import java.util.*;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/5/26
 */
public class PathSum_II {


    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        Deque<Integer> stack = new LinkedList<>();
        pathSum(root, targetSum, result, stack);
        return result;
    }

    public void pathSum(TreeNode root, int targetSum, List<List<Integer>> result, Deque<Integer> pathed) {
        if (root == null) {
            return;
        }
        pathed.addLast(root.val);
        if (root.left == root.right && root.val == targetSum) {
            result.add(new ArrayList<>(pathed));
        }

        pathSum(root.left, targetSum - root.val, result, pathed);
        pathSum(root.right, targetSum - root.val, result, pathed);
        pathed.removeLast();
    }
}
