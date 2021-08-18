package com.vy.leecode.tree;

import com.vy.tree.TreeNode;

/**
 * @author: Ellen
 * @Date: 2021/8/18 10:05
 * @Description: 112. 路径总和
 */
public class Question9 {

	public boolean hasPathSum(TreeNode root, int targetSum) {

		if (root == null) {

			return false;

		}

		if (root.left == null && root.right == null) {

			return root.val == targetSum;

		}

		return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right,
				targetSum - root.val);

	}

}
