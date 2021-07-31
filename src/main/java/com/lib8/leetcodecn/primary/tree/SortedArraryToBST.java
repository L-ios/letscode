package com.lib8.leetcodecn.primary.tree;

import com.lib8.leetcodecn.base.TreeNode;

/**
 * Project: letscode
 *
 * @author: Lionseun Ling
 * @create: 2021/5/18
 */
public class SortedArraryToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        int mid = nums.length/2;
        TreeNode root = new TreeNode(nums[mid]);
        buildTree(root, nums, 0, mid-1);
        buildTree(root, nums, mid+1, nums.length-1);
        return root;
    }
    public void buildTree(TreeNode root, int[] nums, int start, int end) {
        if (start > end) {
            return;
        }
        int mid = (start + end) / 2;
        if (root.val > nums[start]) {
            root.left = new TreeNode(nums[mid]);
            buildTree(root.left, nums, start, mid-1);
            buildTree(root.left, nums, mid+1, end);
        } else {
            root.right = new TreeNode(nums[mid]);
            buildTree(root.right, nums, start, mid-1);
            buildTree(root.right, nums, mid+1, end);
        }
    }
}
