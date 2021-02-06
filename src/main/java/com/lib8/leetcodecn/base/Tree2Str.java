package com.lib8.leetcodecn.base;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Project: letscode
 * leetcode id: 606
 * <a herf="https://leetcode-cn.com/problems/construct-string-from-binary-tree/">根据二叉树创建字符串</a>
 *
 * @author: Lionseun Ling
 * @create: 2020/12/23
 */
public class Tree2Str {
    public String tree2str(TreeNode t) {
        if (t == null) {
            return "";
        }
        Stack<TreeNode> a = new Stack<>();
        Set<TreeNode> pathedNode = new HashSet<>();
        a.push(t);

        StringBuffer sb = new StringBuffer();
        sb.append(t.val);
        while (!a.isEmpty()) {
            TreeNode node = a.peek();
            pathedNode.add(node);
            if (node.left != null && !pathedNode.contains(node.left)) {
                sb.append("(");
                sb.append(node.left.val);
                a.push(node.left);
                continue;
            }
            if (node.right != null && !pathedNode.contains(node.right)) {
                if (node.left == null) {
                    sb.append("()");
                }
                sb.append("(");
                a.push(node.right);
                sb.append(node.right.val);
                continue;
            }
            a.pop();
            sb.append(")");
        }

        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                '}';
    }
}
