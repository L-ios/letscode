package com.lib8.leetcodecn.primary.tree;

import com.lib8.leetcodecn.base.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/5/29
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        var result = "[";
        if (root != null) {
            result += root.val;
            result += serialize(root.left);
            result += serialize(root.right);
        }
        return result + "]";
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Deque<TreeNode> treeStack = new LinkedList<>();
        Deque<Character> cStack = new LinkedList<>();
        



        return treeStack.getLast();
    }

}
