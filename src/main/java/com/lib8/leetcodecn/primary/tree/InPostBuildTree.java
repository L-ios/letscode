package com.lib8.leetcodecn.primary.tree;

import com.lib8.leetcodecn.base.TreeNode;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toMap;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/5/27
 */
public class InPostBuildTree {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> inorderMap = IntStream.range(0, inorder.length).mapToObj(Integer::valueOf).collect(toMap(i -> inorder[i], Function.identity()));
        post_idx = postorder.length -1;
        return helper(inorderMap, postorder, 0, postorder.length-1);
    }
    int post_idx = 0;
    /**
     *
     * @param inorderMap
     * @param postorder
     * @param start 前序遍历游标
     * @param end 前序遍历游标
     * @return
     */
    public TreeNode helper(Map<Integer, Integer> inorderMap, int[] postorder, int start, int end) {
        if (start > end) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[post_idx]);
        post_idx--;
        Integer index = inorderMap.get(root.val);
        root.right = helper(inorderMap, postorder, index+1, end);
        root.left = helper(inorderMap, postorder, start, index-1);
        return root;
    }

}
