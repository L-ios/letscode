package com.lib8.leetcodecn.base;

import java.util.ArrayList;
import java.util.List;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/5/17
 */
public class InOrderTraversal {
    public static List<Integer> inOrderTranversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        recursionInOrder(root, result);
        return result;
    }

    public static void recursionInOrder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            recursionInOrder(root.left, result);
        }
        result.add(root.val);
        if (root.right != null) {
            recursionInOrder(root.right, result);
        }
    }
}
