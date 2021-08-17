package com.vy.leecode.tree;

import com.vy.tree.TreeNode;

/**
 * @author: Ellen
 * @Date: 2021/8/17 10:06
 * @Description:
 */
public class Question7 {

	public boolean isBalanced(TreeNode root) {

		return balance(root) > -1;

	}

	public int balance(TreeNode node) {

		if (node == null) {

			return 0;

		}

		int leftHeight = balance(node.left);

		int rightHeight = balance(node.right);

		if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) {

			return -1;

		} else {

			return Math.max(leftHeight, rightHeight) + 1;

		}

	}
}
