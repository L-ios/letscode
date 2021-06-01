package com.lib8.leetcodecn.primary.tree;

import com.lib8.leetcodecn.base.TreeNode;
import com.sun.source.tree.Tree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/5/27
 */
class InPostBuildTreeTest {

    @Test
    void buildTree() {
        TreeNode node = new InPostBuildTree().buildTree(new int[]{9, 3, 15, 20, 7}, new int[]{9, 15, 7, 20, 3});
        System.out.println("tes");
    }

}