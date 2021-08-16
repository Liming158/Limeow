package com.vy.leecode.tree;

import com.vy.tree.TreeNode;

/**
 * @author: Ellen
 * @Date: 2021/8/16 10:17
 * @Description: 108. 将有序数组转换为二叉搜索树
 */
public class Question5 {

	public TreeNode sortedArrayToBST(int[] nums) {

		return dfs(nums,0,nums.length-1);

	}

	public TreeNode dfs(int[] nums, int le, int hi) {

		if (le > hi) {

			return null;

		}

		int mid = le + (hi - le) / 2;

		TreeNode treeNode = new TreeNode(nums[mid]);

		treeNode.left = dfs(nums, le, mid - 1);

		treeNode.right = dfs(nums, mid + 1, hi);

		return treeNode;

	}

}
