package com.vy.leecode.tree;

import com.vy.tree.TreeNode;

/**
 * @author: Ellen
 * @Date: 2021/8/16 10:4 反转二叉树
 * @Description:
 */
public class Question6 {

	public TreeNode invertTree(TreeNode root) {

		return reverse(root);

	}


	public TreeNode reverse(TreeNode node) {

		if (node == null) {
			return null;
		}

		TreeNode left = reverse(node.left);

		TreeNode right = reverse(node.right);

		node.left = right;

		node.right = left;

		return node;
	}
}
