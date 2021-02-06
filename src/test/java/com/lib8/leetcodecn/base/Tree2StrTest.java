package com.lib8.leetcodecn.base;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2020/12/23
 */
class Tree2StrTest {


    private Tree2Str solution;

    @BeforeEach
    void setUp() {
        solution = new Tree2Str();
    }



    @Test
    void tree2str() {
        //[1,2,3,null,4]
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(3);
        solution.tree2str(root);
    }
}